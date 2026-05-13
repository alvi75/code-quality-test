def popitem(self):
	"""
	Find, remove and return a random `(key, value)` pair via __choice in the class
	"""
	if self._size == 0:
		raise KeyError("pop from empty dictionary")
	return (self._keys.pop(), self._values.pop())