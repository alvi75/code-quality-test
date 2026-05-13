def pop(self, key, default=__marker):
	"""
	D.pop(k[,d]) -> v, remove specified key and return the corresponding value.
If key is not found, d is returned if given, otherwise KeyError is raised.
	"""
	if default is __marker:
		del self[key]
		return None

	try:
		value = self[key]
	except KeyError:
		return default
	del self[key]
	return value