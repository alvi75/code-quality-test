def index(self, key):
	"""
	Returns the key in the form of int.
	"""
	if isinstance(key, int):
		return key
	elif isinstance(key, str):
		return self._str2int(key)
	else:
		raise TypeError("key must be either int or string")