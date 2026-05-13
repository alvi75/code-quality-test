def minimalBases(classes):
	"""
	Returns all classes without subclasses as a list.
	"""
	return [cls for cls in classes if not any(issubclass(cls, c) for c in classes)]