def _c_optimizations_required():
	"""
	Return a true value if the C optimizations are required.
	"""
	return (os.path.exists(os.path.join(_get_buildroot(), "CMakeLists.txt")) or
			os.path.exists(os.path.join(_get_buildroot(), ".gitignore")))