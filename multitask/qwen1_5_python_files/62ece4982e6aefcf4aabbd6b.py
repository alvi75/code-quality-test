def subclasses(cls):
	"""
	Return all subclasses of a class, recursively
	"""
	subclasses = cls.__subclasses__()
	return subclasses + [g for s in subclasses for g in subclasses_for(s)]