def _c_optimizations_required():
	"""
	Return a true value if the C optimizations are required.
	"""
	return (sys.platform == 'win32' or sys.platform == 'darwin') and not os.environ.get('NO_C_OPTIMIZATIONS', False)