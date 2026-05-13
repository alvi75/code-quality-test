def write_configuration(config_filename, rendered_config, mode=0o600, overwrite=False):
	"""
	Given a rendered config YAML, write it out to target file.
    But if the file already exists and overwrite is False,
    abort before writing anything.
    If the file does not exist, create it.
    Write to the file otherwise.

    Returns: None
	"""
	if os.path.exists(config_filename) and not overwrite:
		raise IOError('Configuration file %s already exists' % config_filename)

	with open(config_filename, 'wb') as f:
		f.write(rendered_config.encode('utf-8'))
	os.chmod(config_filename, mode)