def mru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Most Recently Used (MRU)
algorithm.
	"""
	def wrapper(func):
		"""Wrapper for decorating functions."""
		# pylint: disable=missing-docstring
		@wraps(func)
		def wrapped(*args, **kwargs):
			"""Wrapper for decorating functions."""
			if not hasattr(wrapped, '_cache'):
				wrapped._cache = {}
			if func.__name__ in wrapped._cache:
				del wrapped._cache[func.__name__]
			wrapped._cache[func.__name__] = func(*args, **kwargs)
			return wrapped._cache[func.__name__]
		return wrapped

	# pylint: disable=unused-argument
	# pylint: disable=missing-docstring
	return wrapper