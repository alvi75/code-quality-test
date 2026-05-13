def index(self, key):
	"""
	Returns the key in the form of int.
	"""
	if isinstance(key, str) or isinstance(key, unicode):
		key = self.get_index_from_name(key)
	elif not isinstance(key, (int, long)):
		raise TypeError("Key must be a string or integer")
	return key