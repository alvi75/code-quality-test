def names(self, all=False):
	"""
	Return the attribute names of current class.
	"""
	if self._names is None:
	    if hasattr(self, 'get_names'):
		self._names = list(self.get_names())
	    else:
		self._names = []
	return self._names