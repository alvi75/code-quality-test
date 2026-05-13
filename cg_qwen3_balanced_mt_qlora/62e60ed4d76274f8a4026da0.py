def keys(self):
	"""
	Returns the __keys property of a class as a List
	"""
	return list(getattr(self.__class__, '__keys', []))