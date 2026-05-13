def index(self, key):
	"""
	Returns the key in the form of int.
	"""
	if isinstance(key, str) is False:
		raise TypeError("The type of __index__ must be string.")

	return self._dict[key]