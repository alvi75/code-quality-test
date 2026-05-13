def unit_of_work(metadata=None, timeout=None):
	"""
	Returns a decorator with metadata and timeout attributes.
	"""
	def wrapper(f):
		@wraps(f)
		def wrapped(*args, **kwargs):
			"""Wrapper for function f."""
			if not hasattr(f, '_unit_of_work'):
				f._unit_of_work = UnitOfWork()
			if not hasattr(f, '_timeout'):
				f._timeout = timeout

			try:
				result = f(*args, **kwargs)
			except Exception as e:
				result = Result(e)

			if result is None:
				result = Result()

			if isinstance(result, Result):
				result = result.result
			elif isinstance(result, (list, tuple)):
				result = [r.result for r in result]
			elif isinstance(result, dict):
				result = {k: v.result for k, v in result.items()}
			elif isinstance(result, BaseException):
				result = Result(result)
			else:
				raise TypeError("Expected Response or list/tuple/dict")

			if 'metadata' in kwargs:
				kwargs['metadata'].update(f._metadata)
			return result
		return wrapped
	return wrapper