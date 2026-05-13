def popitem(self):
		"""
		Remove and return the `(key, value)` pair least frequently used.
		"""
		if not self:
			raise KeyError('popitem(): dictionary is empty')
		return self._map.popitem(last=False)