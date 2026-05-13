def _should_attempt_c_optimizations():
	"""
	Return a true value if we use the C optimizations.
	"""
	return (
		# We need to be able to import the module
		"__cgo__" in sys.modules or
		# We need to have a c compiler available
		shutil.which("gcc") is not None or
		# We need to have a c++ compiler available
		shutil.which("g++") is not None
	)