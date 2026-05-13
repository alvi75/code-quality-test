def is_run_el(obj):
	"""
	Check whether the obj class has the run method.
	"""
	if not hasattr(obj, 'run'):
		return False

	for cls in obj.__class__.__mro__:
		if not hasattr(cls, 'run'):
			return False

	return True