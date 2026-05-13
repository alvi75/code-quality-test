def names(self, all=False):
	"""
	Return the attribute names of current class.
	"""
	names = [name for name in dir(self) if not name.startswith('_')]
	if all:
		return names
	else:
		return [name for name in names if not name.startswith('_')]