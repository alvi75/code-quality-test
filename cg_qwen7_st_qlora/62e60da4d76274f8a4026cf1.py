def values(self, *keys):
	"""
	Returns the key filtered by self.index in the form of a list.
	"""
	if len(keys) == 0:
		return [self._data[i] for i in self.index]
	else:
		return [self._data[i][k] for k in keys for i in self.index]