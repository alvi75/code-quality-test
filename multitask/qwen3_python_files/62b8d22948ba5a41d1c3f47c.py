def get(self, key, default=None):
	"""
	If a key exists in the class, the value corresponding to the key is returned. Otherwise, default is returned.
	"""
	if self.has(key):
		return self.__dict__[key]
	else:
		return default