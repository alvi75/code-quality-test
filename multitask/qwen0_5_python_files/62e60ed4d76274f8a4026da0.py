def keys(self):
	"""
	Returns the __keys property of a class as a List
	"""
	return [key for key in self.__dict__ if not key.startswith('_')]