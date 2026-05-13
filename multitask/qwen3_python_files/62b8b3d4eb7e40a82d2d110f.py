def _should_attempt_c_optimizations():
	"""
	Return a true value if we use the C optimizations.
	"""
	if not HAVE_C_OPTIMIZATIONS:
		return False

	if sys.platform == 'win32':
		return True

	if sys.platform == 'darwin':
		return True

	if sys.platform == 'linux' and os.getuid() == 0:
		return True

	return False