def popitem(self):
	"""
	Remove and return the `(key, value)` pair least frequently used.
	"""
	if not self:
		raise KeyError('popitem(): dictionary is empty')
	k = min(iter(self), key=self.__getitem__)
	v = self.pop(k)
	return (k,v)