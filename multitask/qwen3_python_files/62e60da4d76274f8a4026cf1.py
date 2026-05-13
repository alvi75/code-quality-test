def values(self, *keys):
	"""
	Returns the key filtered by self.index in the form of a list.
	"""
	if len(keys) == 0:
		return [self[index] for index in self.index]
	else:
		return [self[key] for key in keys]