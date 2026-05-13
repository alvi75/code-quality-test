def popitem(self):
	"""
	Find, remove and return a random `(key, value)` pair via __choice in the class
	"""
	key = self.__choice(list(self.items()))
	return key[0], key[1]