def _c_optimizations_available():
	"""
	If available, return the C optimization module, otherwise a false value.
	"""
	try:
		import pyximport
	except ImportError:
		return False

	pyximport.install()
	try:
		from psyplot.plotter.cythonizer import cythonize
	except ImportError:
		return False
	else:
		return True