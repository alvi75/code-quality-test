def popitem(self):
	"""
	Remove and return the `(key, value)` pair least frequently used.
	"""
	if not self:
		raise KeyError('list is empty')
	node = self._head[2]
	key = node.key
	del self[key]
	return (key, node.value)