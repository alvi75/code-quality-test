def is_fill_compute_el(obj):
	"""
	Check whether the obj class has the fill and compute methods.
	"""
	if hasattr(obj, 'fill') and callable(getattr(obj, 'fill')):
		return True
	if hasattr(obj, 'compute') and callable(getattr(obj, 'compute')):
		return True
	return False