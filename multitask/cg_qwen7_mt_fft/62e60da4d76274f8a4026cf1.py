def values(self, *keys):
		"""
		Returns the key filtered by self.index in the form of a list.
		"""
		if len(keys) == 0:
			return [self._dict[key][self.index] for key in self.keys()]
		else:
			return [self._dict[key][self.index] for key in keys]