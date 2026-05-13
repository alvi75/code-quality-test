def is_run_el(obj):
	"""
	Check whether the obj class has the run method.
	"""
	if hasattr(obj, 'run'):
		return True
	for name in dir(obj.__class__):
		if name == 'run':
			return True
	return False