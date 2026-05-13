def setdefault(self, key, default=None):
		"""
		If a key exists in the class, the value corresponding to the key is returned. Otherwise, the value corresponding to the key is set to default.
		"""
		if not hasattr(self,key):
			self.__setattr__(key,default)
		return self.__getattribute__(key)