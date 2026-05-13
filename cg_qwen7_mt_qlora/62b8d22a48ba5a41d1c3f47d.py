def pop(self, key, default=__marker):
	"""
	D.pop(k[,d]) -> v, remove specified key and return the corresponding value.
If key is not found, d is returned if given, otherwise KeyError is raised.
	"""
	if self._hash is None:
		raise TypeError("pop of empty dictionary")
	if key in self._hash:
		value = self._hash[key]
		del self._hash[key]
		return value
	elif default is not __marker:
		return default
	else:
		raise KeyError(key)