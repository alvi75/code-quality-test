def load_configurations(config_filenames, overrides=None, resolve_env=True):
	"""
	Given a sequence of configuration filenames, load and validate each configuration file. If the configuration file
cannot be read due to insufficient permissions or error parsing configuration file, the error log will
be recorded. Otherwise, return the results as a tuple of: dict of configuration filename to corresponding parsed configuration,
and sequence of logging.LogRecord instances containing any parse errors.
	"""

	if not config_filenames:
		return {}, []

	configs = {}
	errors = []
	for config_filename in config_filenames:
		try:
			with open(config_filename) as f:
				config = yaml.safe_load(f)
		except (IOError, OSError) as e:
			logger.error("Could not read configuration file %r: %s", config_filename, e)
			continue

		if not isinstance(config, dict):
			logger.error("Configuration file %r is not valid YAML.", config_filename)
			continue

		if overrides:
			config.update(overrides)

		if resolve_env:
			resolve_environment_variables(config)

		validated_config = validate_configuration(config)
		if validated_config is None:
			continue

		configs[config_filename] = validated_config

	return configs, errors