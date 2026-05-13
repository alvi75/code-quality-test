def is_run_el(obj):
	"""
	Check whether the obj class has the run method.
	"""
	if not isinstance(obj, Element):
		return False

	try:
		obj.run()
	except AttributeError:
		return False
	else:
		return True