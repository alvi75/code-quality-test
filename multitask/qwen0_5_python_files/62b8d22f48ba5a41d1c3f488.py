def popitem(self):
	"""
	Remove the value corresponding to the first inserted key and returns the key and value in tuple format.
	"""
	key, value = self._popitem()
	self._size -= 1
	return key, value