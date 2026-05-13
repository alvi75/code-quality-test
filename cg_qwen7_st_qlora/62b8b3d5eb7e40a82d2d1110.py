def _c_optimizations_available():
	"""
	If available, return the C optimization module, otherwise a false value.
	"""
	try:
		from . import c_optimizations as copt
	except ImportError:
		return False

	if not hasattr(copt, 'optimize'):
		raise ImportError("C optimizations were compiled but do not have the optimize function")

	return copt