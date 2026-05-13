def popitem(self):
	"""
	Remove and return the `(key, value)` pair least recently used.
	"""
	if not self._items:
		raise KeyError('list is empty')
	node = self._items.pop()
	del self[node.key]
	return node.key, node.value