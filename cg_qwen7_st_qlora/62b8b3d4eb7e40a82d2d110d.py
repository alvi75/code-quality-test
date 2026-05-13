def _c_optimizations_required():
	"""
	Return a true value if the C optimizations are required.
	"""
	try:
		import numpy as np
	except ImportError:
		return True

	if not hasattr(np, 'float128'):
		return True

	if sys.version_info[0] < 3:
		return True

	return False