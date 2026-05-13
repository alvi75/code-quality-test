def get_config():
	"""
	Return a new VersioneerConfig() and set various attribute of it.
	"""
	import versioneer

	cfg = versioneer.get_config()
	cfg.versionfile_source = 'setup.cfg'
	cfg.tag_prefix = 'v'  # tag prefix for git tags
	cfg.parentdir_prefix = 'monasca-'  # parent directory prefix for extracted source trees
	cfg.vertag_re = r'^\d+\.\d+\.\d+(-\w\d+)?$'  # regexp to match tag names
	cfg.rewrite_setup_py = True  # rewrite setup.py to insert/update version info
	return cfg