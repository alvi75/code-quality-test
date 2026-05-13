def keys(self):
	"""
	Returns the __keys property of a class as a List
	"""
	if not hasattr(self, '__keys'):
		self.__keys = list(self.__dict__.keys())
	return self.__keys