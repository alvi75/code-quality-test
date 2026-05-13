def _c_optimizations_ignored():
	"""
	Return True if get "PURE_PYTHON" environ is not none and not 0, else return False
	"""
	try:
		return os.environ["PURE_PYTHON"] != '0' and os.environ["PURE_PYTHON"]
	except KeyError:
		return False