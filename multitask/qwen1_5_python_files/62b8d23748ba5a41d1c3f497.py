def popitem(self):
	"""
	Remove a key from the dictionary.

	>>> d = {1: 2}
	>>> d.pop(1)
	2

	@type key: object
	@rtype: object
	"""
	key = self._heap[0][1]
	del self[key]
	return key