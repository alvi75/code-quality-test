def subclasses(cls):
	"""
	Return all subclasses of a class, recursively
	"""
	return [cls.__subclasses__()] + [c for c in cls.__subclasses__() if issubclass(c, cls)]