def popitem(self):
	"""
	"Remove and return the (key, value) pair most recently used.
	"
	"""
	if self._size == 0:
	    raise KeyError('popitem() on empty dictionary')
	node = self._head[2]
	key = node.key
	del self[key]
	return key, node.value