def popitem(self):
	"""
	def popitem(self):
	"""
	"""
	"""
	Remove the value corresponding to the first inserted key and returns the key and value in tuple format.
	"""
	if self._size == 0:
	    raise KeyError("list is empty")
	key, val = self._keys[0], self._values[0]
	del self._keys[0]
	del self._values[0]
	self._size -= 1
	return (key, val)
	"""