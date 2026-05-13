def setdefault(self, key, default=None):
		"""
		If a key exists in the class, the value corresponding to the key is returned. Otherwise, the value corresponding to the key is set to default.
		"""
		if not self.__contains__(key):
			self.__setitem__(key, default)
		return self[key]