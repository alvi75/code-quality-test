def keys(self):
		"""
		Returns the __keys property of a class as a List
		"""
		if self.__keys is None:
			self.__keys = KeyList(self)
		return self.__keys