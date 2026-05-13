def keys(self):
	"""
	Returns the __keys property of a class as a List
	"""
	if not hasattr(self, '__keys'):
		self.__keys = []
	for k in self.__dict__.keys():
		if not k.startswith('_') and not callable(getattr(self,k)):
			self.__keys.append(k)
	return self.__keys