def names(self, all=False):
	"""
	Return the attribute names of current class.
	"""
	if not self._names:
		self._names = [name for name in dir(self.__class__) if not name.startswith('_')]
	return self._names