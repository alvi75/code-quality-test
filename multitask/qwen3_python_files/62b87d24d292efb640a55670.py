def get_versions():
	"""
	Obtains the version information. If the version information cannot be obtained, the default value is returned.
	"""
	try:
		version = pkg_resources.require("pyciss")[0].version
	except Exception as e:
		version = "unknown"
	return version