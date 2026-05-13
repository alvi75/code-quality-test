def _c_optimizations_required():
	"""
	Return a true value if the C optimizations are required.
	"""
	import sys

	if "linux" in sys.platform:
		return True

	elif "darwin" in sys.platform:
		return False

	else:
		raise RuntimeError("Platform {} not supported".format(sys.platform))