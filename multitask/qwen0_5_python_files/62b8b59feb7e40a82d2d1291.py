def _getTargetClass(self):
	"""
	Define this to return the implementation in use,
without the 'Py' or 'Fallback' suffix.
	"""
	if self._targetClass is None:
		self._targetClass = self.__class__.__name__.split('Py')[0]
	return self._targetClass