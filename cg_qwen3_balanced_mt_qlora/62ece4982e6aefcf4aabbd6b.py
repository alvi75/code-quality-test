def subclasses(cls):
	"""
	Return all subclasses of a class, recursively
	"""
	for subclass in cls.__subclasses__():
		yield from subclasses(subclass)
		yield subclass