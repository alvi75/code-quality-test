def _getTargetClass(self):
	"""
	Define this to return the implementation in use,
without the 'Py' or 'Fallback' suffix.
	"""
	if self._targetClass is None:
		self._targetClass = type(self.__class__.__name__, (self.__class__,), {})
	return self._targetClass