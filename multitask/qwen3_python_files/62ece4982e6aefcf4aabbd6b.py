def subclasses(cls):
	"""
	Return all subclasses of a class, recursively
	"""
	subclasses = []
	for sub in cls.__subclasses__():
		subclasses.append(sub)
	subclasses.extend(subclass.subclasses() for subclass in sub.__subclasses__())
	return subclasses