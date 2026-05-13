def mru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Most Recently Used (MRU)
	algorithm.
	"""
	cache = LRUCache(maxsize)

	def decorating_function(original_function):
		if not hasattr(original_function, '__wrapped__'):
			original_function.__wrapped__ = original_function

		@functools.wraps(original_function)
		def wrapper(*args, **kwargs):
			key = _make_key(original_function, args, kwargs)
			try:
				return cache[key]
			except KeyError:
				pass  # key does not exist in cache
			result = cache[key] = original_function(*args, **kwargs)
			return result

		return decorating_function

	return decorating_function