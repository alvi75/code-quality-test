def unit_of_work(metadata=None, timeout=None):
	"""
	Returns a decorator with metadata and timeout attributes.
	"""
	def wrapper(func):
		if not hasattr(func, 'unit_of_work'):
			func.unit_of_work = {'metadata': {}, 'timeout': None}
		if metadata:
			func.unit_of_work['metadata'].update(metadata)
		if timeout is not None:
			func.unit_of_work['timeout'] = timeout
		return func

	return wrapper