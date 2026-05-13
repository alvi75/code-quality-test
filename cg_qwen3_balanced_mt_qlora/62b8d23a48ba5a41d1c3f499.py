def popitem(self):
		"""
		Remove and return the `(key, value)` pair least recently used.
		"""
		if not self:
			raise KeyError('popitem(): dictionary is empty')
		key, value = self._map.popitem(last=False)
		self._map[key] = (0, key)
		return (key, value[1])