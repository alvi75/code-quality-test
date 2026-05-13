def index(self, key):
	"""
	Returns the key in the form of int.
	"""
	if isinstance(key, str):
		return self._index[key]
	else:
		return key