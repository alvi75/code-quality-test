def _c_optimizations_ignored():
	"""
	Return True if get "PURE_PYTHON" environ is not none and not 0, else return False
	"""
	if os.environ.get('PURE_PYTHON') in ('', '0'):
		return True

	try:
		import numpy as np
	except ImportError:
		return True

	return False