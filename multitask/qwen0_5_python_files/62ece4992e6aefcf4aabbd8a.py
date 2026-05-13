def load_configurations(config_filenames, overrides=None, resolve_env=True):
	"""
	Given a sequence of configuration filenames, load and validate each configuration file. If the configuration file
	cannot be read due to insufficient permissions or error parsing configuration file, the error log will
	be recorded. Otherwise, return the results as a tuple of: dict of configuration filename to corresponding parsed configuration,
	and sequence of logging.LogRecord instances containing any parse errors.
	"""
	configs = {}
	for config_filename in config_filenames:
		try:
			with open(config_filename) as f:
				config = yaml.safe_load(f)
				if not isinstance(config, dict):
					raise ValueError("Configuration file %r is not valid YAML" % (config_filename,))
				config['filename'] = os.path.basename(config_filename)
				configs[config_filename] = config
		except Exception as e:
			# TODO: better way to do this?
			logging.error("Unable to load configuration from %r: %s", config_filename, str(e))
			continue

		if overrides is None:
			overrides = {}

		for key, value in overrides.items():
			if key in config:
				value = _resolve_value(value, config[key])
				if value is not None:
					config[key] = value

		try:
			parsed_config = ConfigParser()
			parsed_config.read_dict(config)
			config = {key: parsed_config.get(key) for key in config}
		except Exception as e:
			# TODO: better way to do this?
			logging.error("Unable to parse configuration from %r: %s", config_filename, str(e))
			continue

		if resolve_env:
			config = _resolve_environment_variables(config)

		return configs, [logging.LogRecord(*e.args)] if len(e.args) == 1 else e.args