def popitem(self):
	"""
	"Remove and return the (key, value) pair most recently used.
	"""
	if self._size == 0:
		raise KeyError("pop from empty dictionary")
	self._size -= 1
	return self._dict.popitem()