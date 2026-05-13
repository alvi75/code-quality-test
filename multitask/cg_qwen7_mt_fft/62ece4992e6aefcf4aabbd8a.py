def load_configurations(config_filenames, overrides=None, resolve_env=True):
	"""
	Given a sequence of configuration filenames, load and validate each configuration file. If the configuration file
cannot be read due to insufficient permissions or error parsing configuration file, the error log will
be recorded. Otherwise, return the results as a tuple of: dict of configuration filename to corresponding parsed configuration,
and sequence of logging.LogRecord instances containing any parse errors.
	"""

	configs = {}
	parse_warnings = []

	for config_filename in config_filenames:
		try:
			with open(config_filename) as f:
				config_contents = json.load(f)
		except EnvironmentError as e:
			parse_warnings.append(logging.LogRecord('config_utils', logging.WARNING, __name__, 0, 'Failed to read {}: {}'.format(config_filename, str(e)), [], None))
			continue

		if not isinstance(config_contents, dict):
			parse_warnings.append(logging.LogRecord('config_utils', logging.WARNING, __name__, 0, '{} is not a valid JSON file'.format(config_filename), [], None))
			continue

		configs[config_filename] = config_contents

	if overrides:
		for override_key, override_value in six.iteritems(overrides):
			if '.' in override_key:
				parts = override_key.split('.')
				filename = parts.pop(0)

				if filename not in configs:
					parse_warnings.append(logging.LogRecord('config_utils', logging.WARNING, __name__, 0, 'Attempted to set {}.{} but {} does not exist'.format(filename, override_key, filename), [], None))
					continue

				current_dict = configs[filename]
				for part in parts[:-1]:
					if part not in current_dict:
						current_dict[part] = {}

					current_dict = current_dict[part]

				if parts[-1] in current_dict:
					parse_warnings.append(logging.LogRecord('config_utils', logging.WARNING, __name__, 0, 'Overriding existing key {} with value {} from file {}'.format(parts[-1], override_value, filename), [], None))

				current_dict[parts[-1]] = override_value

	if resolve_env:
		resolve_environment_variables_in_configuration(configs)

	return (configs, parse_warnings)