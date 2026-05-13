def names(self, all=False):
	"""
	Return the attribute names of current class.
	"""
	if not self._names:
		self._names = [name for name in dir(self) if not name.startswith('_')]
	return self._names if all else [name for name in self._names if not name.startswith('get_') and not name.startswith('set_')]