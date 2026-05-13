def popitem(self):
	"""
	Remove a key from the dictionary.

	>>> d = {1: 2}
	>>> d.pop(1)
	2

	@type key: object
	@rtype: object
	"""
	if not self._dict:
		raise KeyError('Set is empty')
	key = min(self._dict.keys())
	del self._dict[key]
	return key