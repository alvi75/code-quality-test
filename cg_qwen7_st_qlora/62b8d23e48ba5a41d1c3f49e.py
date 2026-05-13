def popitem(self):
	"""
	Find, remove and return a random `(key, value)` pair via __choice in the class
	"""
	if self._keys is None:
		raise KeyError('pop from empty dictionary')
	key = self.__choice(list(self._keys))
	value = self[key]
	del self[key]
	return key, value