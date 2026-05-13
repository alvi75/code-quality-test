def pop(self, key, default=__marker):
	"""
	D.pop(k[,d]) -> v, remove specified key and return the corresponding value.
	If key is not found, d is returned if given, otherwise KeyError is raised.
	"""
	if self._has_key(key):
		self._dict.pop(key)
		return self[key]
	else:
		if default is __marker:
			raise KeyError("Key %s does not exist" % (key,))
		elif callable(default):
			return default()
		else:
			return default