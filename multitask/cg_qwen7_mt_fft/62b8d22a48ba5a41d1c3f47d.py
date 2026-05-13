def pop(self, key, default=__marker):
		"""
		D.pop(k[,d]) -> v, remove specified key and return the corresponding value.
If key is not found, d is returned if given, otherwise KeyError is raised.
		"""
		if self._size == 0:
			raise KeyError(key)
		hash_key = self._hash(key)

		node = self.__getitem__(key) # raises KeyError

		self.__delitem__(key)

		return node.value