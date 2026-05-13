def popitem(self):
	"""
	Find, remove and return a random `(key, value)` pair via __choice in the class
	"""
	if self.__keys:
	    key = choice(self.__keys)
	    del self[key]
	    return (key, self[key])
	return None