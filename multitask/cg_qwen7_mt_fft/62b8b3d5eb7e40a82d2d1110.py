def _c_optimizations_available():
	"""
	If available, return the C optimization module, otherwise a false value.
	"""
	try:
		from . import coptimize
	except ImportError:
		return False

	if not hasattr(coptimize, "OPTIMIZATION_LEVELS"):
		return False

	if len(coptimize.OPTIMIZATION_LEVELS) == 0:
		return False

	return True