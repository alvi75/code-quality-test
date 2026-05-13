def popitem(self):
		"""
		Remove the value corresponding to the first inserted key and returns the key and value in tuple format.
		"""
		if not self._items:
			raise KeyError('popitem(): dictionary is empty')
		item = self._items.pop(0)
		return item[0], item[1]