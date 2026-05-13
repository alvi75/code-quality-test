def _c_optimizations_available():
	"""
	If available, return the C optimization module, otherwise a false value.
	"""
	try:
		return __import__("pygsl._optimizations")
	except ImportError:
		return False