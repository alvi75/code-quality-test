def popitem(self):
	"""
	Remove and return the `(key, value)` pair least recently used.
	"""
	if self._cache:
		k = next(iter(self._cache))
		return (k, self[k])
	else:
		raise KeyError('pop from empty cache')