def minimalBases(classes):
	"""
	Returns all classes without subclasses as a list.
	"""
	return [cls for cls in classes if not issubclass(cls, (type, type.__bases__))) ]