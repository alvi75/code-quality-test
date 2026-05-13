def _c_optimizations_ignored():
	"""
	Return True if get "PURE_PYTHON" environ is not none and not 0, else return False
	"""
	if os.environ.get("PURE_PYTHON", None) in ["1", "True"]:
		return True

	try:
		from Cython.Compiler.Main import default_options as cy_options
	except ImportError:
		cy_options = {}

	if cy_options.get("no_lib", None):
		return True

	return False