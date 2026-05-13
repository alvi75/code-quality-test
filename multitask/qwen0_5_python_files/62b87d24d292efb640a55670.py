def get_versions():
	"""
	Obtains the version information. If the version information cannot be obtained, the default value is returned.
	"""
	try:
		import pkg_resources
		version = pkg_resources.get_distribution('pycbc').version
	except ImportError:
		version = '0.0.dev0'
	return version