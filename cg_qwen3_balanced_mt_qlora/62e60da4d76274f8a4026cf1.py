def values(self, *keys):
	"""
	Returns the key filtered by self.index in the form of a list.
	"""
	return [self._get(key) for key in keys]