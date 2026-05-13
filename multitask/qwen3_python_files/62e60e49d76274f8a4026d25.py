def unit_of_work(metadata=None, timeout=None):
	"""
	Returns a decorator with metadata and timeout attributes.
	"""
	def wrapper(func):
		func.unit_of_work = True
		func.metadata = metadata or {}
		func.timeout = timeout
		return func
	return wrapper