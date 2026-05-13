def values(self, *keys):
	"""
	Returns the key filtered by self.index in the form of a list.
	"""
	if len(keys) == 0:
		return [self]
	elif len(keys) == 1:
		return [self.keys()[keys[0]]]
	else:
		return [[k] for k in keys]