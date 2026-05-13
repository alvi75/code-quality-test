def get_config():
	"""
	Return a new VersioneerConfig() and set various attribute of it.
	"""
	config = VersioneerConfig()
	config.vcs = _get_vcs()
	if config.vcs is None:
		raise VersioneerError("No version control system found.")
	config.versionfile_search_location = os.path.dirname(__file__)
	config.versionfile_name = 'version.py'
	config.tag_prefix = ''
	config.parentdir_prefix = 'v'
	config.increase_version_on_commit = True
	return config