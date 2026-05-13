def load_configurations(config_filenames, overrides=None, resolve_env=True):
	"""
	Given a sequence of configuration filenames, load and validate each configuration file. If the configuration file
cannot be read due to insufficient permissions or error parsing configuration file, the error log will
be recorded. Otherwise, return the results as a tuple of: dict of configuration filename to corresponding parsed configuration,
and sequence of logging.LogRecord instances containing any parse errors.
	"""
	if overrides is None:
		overrides = {}
	configs = {}
	errors = []
	for config_filename in config_filenames:
		try:
			with open(config_filename) as f:
				configs[config_filename] = _load_configuration(f.read(), overrides=overrides, resolve_env=resolve_env)
		except Exception as e:
			errors.append(logging.makeLogRecord({
				'levelno': logging.ERROR,
				'msg': 'Error loading configuration from %r: %s' % (config_filename, e),
				'type': type(e).__name__,
				'value': str(e),
				'args': e.args,
				'exc_info': True,
				'filename': config_filename,
			}))
	return configs, errors