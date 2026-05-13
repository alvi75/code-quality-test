def is_fill_request_el(obj):
	"""
	Check whether the obj class has the fill and request attributes.
	"""
	if hasattr(obj, 'fill') and hasattr(obj, 'request'):
		return True
	else:
		return False