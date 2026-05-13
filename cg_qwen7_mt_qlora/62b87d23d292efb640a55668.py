def get_config():
	"""
	Return a new VersioneerConfig() and set various attribute of it.
	"""
	config = VersioneerConfig()
	try:
		import setuptools_scm
	except ImportError:
		pass
	else:
		if hasattr(setuptools_scm, "get_version"):
			setuptools_scm_get_version = setuptools_scm.get_version
		elif hasattr(setuptools_scm, "_get_version"):
			setuptools_scm_get_version = getattr(
				setuptools_scm,
				"_get_version",
			)
		else:
			raise RuntimeError("setuptools-scm is installed but has no "
							   "'get_version' function")
		config.setuptools_scm_get_version = setuptools_scm_get_version

	return config