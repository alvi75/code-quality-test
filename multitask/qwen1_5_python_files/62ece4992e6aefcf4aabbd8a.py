def load_configurations(config_filenames, overrides=None, resolve_env=True):
	"""
	Given a sequence of configuration filenames, load and validate each configuration file. If the configuration file
cannot be read due to insufficient permissions or error parsing configuration file, the error log will
be recorded. Otherwise, return the results as a tuple of: dict of configuration filename to corresponding parsed configuration,
and sequence of logging.LogRecord instances containing any parse errors.
	"""
	configs = {}
	errors = []
	for config_filename in config_filenames:
		try:
			with open(config_filename) as f:
				config = ConfigParser()
				config.readfp(f)
		except IOError as e:
			errors.append(LOGGER.error("Error reading %r: %s", config_filename, str(e)))
			continue

		if not isinstance(overrides, dict):
			overrides = {}

		config.update(overrides)

		# Validate that all required options exist for key in REQUIRED_OPTIONS:
		#   - if the option is defined by the config parser, use its value; otherwise, use the default value
		#     (this allows us to have defaults per section, which makes it easier to override them per project).
		#   - if the option is not defined, raise an exception
		for opt in REQUIRED_OPTIONS:
			if opt not in config:
				raise ConfigurationError(
					"Required option '%s' missing from %s." % (opt, config_filename))

		configs[config_filename] = config

	return configs, errors