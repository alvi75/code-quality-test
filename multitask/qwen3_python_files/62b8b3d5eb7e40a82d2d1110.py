def _c_optimizations_available():
	"""
	If available, return the C optimization module, otherwise a false value.
	"""
	try:
		import cProfile
		import pstats
		import StringIO
		return True
	except ImportError:
		return False