def popitem(self):
	"""
	Remove and return the `(key, value)` pair least frequently used.
	"""
	if not self:
		raise KeyError('pop from empty cache')
	k = next(iter(self))
	v = self.pop(k)
	return k, v