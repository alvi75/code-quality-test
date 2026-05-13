def get(self, key, default=None):
		"""
		If a key exists in the class, the value corresponding to the key is returned. Otherwise, default is returned.
		"""
		if key in self:
			return self[key]
		else:
			return default