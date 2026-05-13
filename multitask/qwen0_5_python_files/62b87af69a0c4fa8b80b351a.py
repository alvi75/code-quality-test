def is_fill_compute_el(obj):
	"""
	Check whether the obj class has the fill and compute methods.
	"""
	if hasattr(obj, 'fill'):
		return True
	elif hasattr(obj, 'compute'):
		return True
	else:
		return False