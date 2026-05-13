def _c_optimizations_available():
	"""
	If available, return the C optimization module, otherwise a false value.
	"""
	try:
		return importlib.import_module('pyparsing.core_c')
	except ImportError:
		pass