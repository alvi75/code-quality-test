def minimalBases(classes):
	"""
	Returns all classes without subclasses as a list.
	"""
	bases = []
	for c in classes:
		if not any([issubclass(c, b) for b in classes]):
			bases.append(c)
	return bases