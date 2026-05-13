def is_run_el(obj):
	"""
	Check whether the obj class has the run method.
	"""
	if hasattr(obj, 'run'):
		return True
	elif isinstance(obj, (list, tuple)):
		for item in obj:
			if is_run_el(item):
				return True
	else:
		return False