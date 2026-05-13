def popitem(self):
	"""
	"Remove and return the (key, value) pair most recently used.
	"""
	if self._cache:
		k = next(reversed(self._cache))
		return k, self._cache.pop(k)
	else:
		raise KeyError('pop from empty cache')