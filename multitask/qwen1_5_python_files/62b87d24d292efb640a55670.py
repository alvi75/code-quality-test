def get_versions():
	"""
	Obtains the version information. If the version information cannot be obtained, the default value is returned.
	"""
	try:
		import pkg_resources
	except ImportError:
		return DEFAULT_VERSION

	version = pkg_resources.get_distribution("requests").version
	if not re.match(r"^(\d+\.)?\d+\.\d+(-\d+[a-z]?)*$", version):
		raise RuntimeError(
			"Version string does not conform to PEP 440 specification: %s" % version)
	return version