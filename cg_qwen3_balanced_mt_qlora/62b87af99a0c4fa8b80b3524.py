def is_run_el(obj):
	"""
	Check whether the obj class has the run method.
	"""
	return hasattr(obj, 'run') and callable(getattr(obj, 'run'))