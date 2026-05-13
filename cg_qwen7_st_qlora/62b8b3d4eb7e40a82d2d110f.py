def _should_attempt_c_optimizations():
	"""
	Return a true value if we use the C optimizations.
	"""
	try:
		import numpy as np
	except ImportError:
		return False

	if not hasattr(np, 'dot'):
		return False

	if not hasattr(np.dot, '__array_ufunc__'):
		return False

	return True