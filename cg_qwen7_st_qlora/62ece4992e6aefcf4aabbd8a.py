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
	parse_errors = []
	for config_filename in config_filenames:
		try:
			with open(config_filename) as f:
				config = yaml.safe_load(f)
				configs[config_filename] = config
		except IOError as e:
			logger.error("Could not read configuration file %r: %s", config_filename, e.strerror)
		else:
			try:
				config = _resolve_environment_variables(config, resolve_env=resolve_env)
				config = _override_configuration(config, overrides)
				config = _validate_configuration(config)
			except ConfigurationError as e:
				logger.error(e.message)
				parse_errors.append(e)

	return configs, parse_errors