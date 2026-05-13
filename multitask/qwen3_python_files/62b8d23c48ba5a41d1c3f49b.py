def popitem(self):
	"""
	def popitem(self):
	"""
	if self._size == 0:
	    raise KeyError('list is empty')
	key = self._keys[-1]
	del self._dict[key]
	del self._keys[-1]
	self._size -= 1
	return key, self._values.pop()