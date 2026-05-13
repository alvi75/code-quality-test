def _getTargetClass(self):
	"""
	Define this to return the implementation in use,
without the 'Py' or 'Fallback' suffix.
	"""
	if self.targetClass:
		return self.targetClass

	elif hasattr(self, "pyclass"):
		return self.pyclass

	else:
		raise NotImplementedError("No target class defined")