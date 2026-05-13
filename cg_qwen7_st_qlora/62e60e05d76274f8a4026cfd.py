def index(self, key):
	"""
	Returns the key in the form of int.
	"""
	if isinstance(key, str) or isinstance(key, unicode):
		return self._keys.index(key)
	else:
		return key