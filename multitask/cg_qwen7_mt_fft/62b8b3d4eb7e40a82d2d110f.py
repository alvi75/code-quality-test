def _should_attempt_c_optimizations():
	"""
	Return a true value if we use the C optimizations.
	"""
	if not config.use_ext:
		return False

	if sys.platform == "win32":
		log.warn("WARNING: Running on Windows, so skipping Cython optimization.")
		return False

	try:
		import numpy
	except ImportError:
		log.warn("WARNING: Unable to import NumPy; skipping Cython optimization.")
		return False

	if LooseVersion(numpy.__version__) < LooseVersion('1.7'):
		log.warn("WARNING: NumPy version %s is installed; "
		         "skipping Cython optimization." % numpy.__version__)
		return False

	return True