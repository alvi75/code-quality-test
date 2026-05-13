def popitem(self):
		"""
		Find, remove and return a random `(key, value)` pair via __choice in the class
		"""
		if not self:
			raise KeyError('popitem(): empty dictionary')
		return next(iter(self.__class__.__choice__(self)))