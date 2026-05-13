def get_config():
	"""
	Return a new VersioneerConfig() and set various attribute of it.
	"""
	config = VersioneerConfig()
	if config.versionfile_source is None:
		raise ValueError("versionfile_source not specified")
	if not os.path.exists(config.versionfile_source):
		raise ValueError("versionfile_source '%s' does not exist" % config.versionfile_source)
	if not config.is_valid_py_file(config.versionfile_source):
		raise ValueError(
			"%r is not a valid python file" % config.versionfile_source)
	config.versionfile_source = os.path.abspath(config.versionfile_source)

	version = _get_version_from_file(config.versionfile_source, config.versionvar,
										config.full)
	if version is None:
		raise ValueError("could not parse version from %r" % config.versionfile_source)
	config.version = version

	return config