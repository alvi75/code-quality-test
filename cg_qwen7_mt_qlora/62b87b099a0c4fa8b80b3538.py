def is_fill_request_el(obj):
	"""
	Check whether the obj class has the fill and request attributes.
	"""
	if not hasattr(obj, 'fill') or not callable(obj.fill):
		return False

	if not hasattr(obj, 'request') or not callable(obj.request):
		return False

	return True