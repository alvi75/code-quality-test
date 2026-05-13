def index(self, key):
	"""
	Returns the key in the form of int.
	"""
	if isinstance(key, slice):
		return self._slice_to_index(key)
	elif isinstance(key, (int, long)):
		return key
	else:
		raise TypeError("Invalid type for key: %s" % type(key))