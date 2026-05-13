def _getTargetClass(self):
	"""
	Define this to return the implementation in use,
without the 'Py' or 'Fallback' suffix.
	"""
	if self._impl == 'py':
		return PyTarget
	elif self._impl == 'py-fallback':
		return FallbackTarget
	else:
		raise ValueError("Unknown target type: %s" % self._impl)