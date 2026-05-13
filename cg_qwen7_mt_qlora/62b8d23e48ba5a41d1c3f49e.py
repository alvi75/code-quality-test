def popitem(self):
	"""
	Find, remove and return a random `(key, value)` pair via __choice in the class
	"""
	if not self:
		raise KeyError('popitem(): dictionary is empty')
	key = self.__choice(list(self.keys()))
	value = self.pop(key)
	return key, value