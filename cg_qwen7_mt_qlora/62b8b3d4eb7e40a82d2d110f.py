def _should_attempt_c_optimizations():
	"""
	Return a true value if we use the C optimizations.
	"""
	try:
		import numpy as np
	except ImportError:
		return False

	if not hasattr(np, 'float128'):
		return False

	return True