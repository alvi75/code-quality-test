def values(self, *keys):
	"""
	Returns the key filtered by self.index in the form of a list.
	"""
	if len(keys) == 0:
		return [self[index] for index in self.index]
	else:
		keys = set(keys)
		return [self[index] for index in self.index if index in keys]