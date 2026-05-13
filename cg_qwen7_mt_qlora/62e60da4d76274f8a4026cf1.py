def values(self, *keys):
	"""
	Returns the key filtered by self.index in the form of a list.
	"""
	if len(keys) == 0:
		return [self._values[i] for i in self.index]
	else:
		return [self._values[self.index.get_loc(k)] for k in keys]