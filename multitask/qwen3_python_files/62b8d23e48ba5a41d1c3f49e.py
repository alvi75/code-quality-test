def popitem(self):
	"""
	def popitem(self):
	"""
	if self._size == 0:
		raise KeyError('list is empty')
	key, value = self._dict.popitem()
	self._size -= 1
	return (key, value)