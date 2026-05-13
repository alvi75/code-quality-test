def index(self, key):
	"""
	Returns the key in the form of int.
	"""
	if isinstance(key, str):
		key = self._key_from_str(key)
	elif not isinstance(key, int):
		raise TypeError("index() argument must be a string or integer")
	return key