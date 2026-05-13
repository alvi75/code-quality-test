def _c_optimizations_ignored():
	"""
	Return True if get "PURE_PYTHON" environ is not none and not 0, else return False
	"""
	if os.environ.get('PURE_PYTHON', None) is not None:
		return bool(int(os.environ['PURE_PYTHON']))
	else:
		return False