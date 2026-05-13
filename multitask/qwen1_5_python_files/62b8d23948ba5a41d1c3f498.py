def lru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm.
	"""
	cache = LRUCache(maxsize)

	def decorating_function(original_function):
		if not hasattr(original_function, '__wrapped__'):
			original_function.__wrapped__ = original_function

		@functools.wraps(original_function, assigned=('restype', 'argtypes'))
		def wrapper(*args, **kwargs):
			key = str((args, kwargs))
			try:
				result = cache[key]
			except KeyError:
				result = cache[key] = original_function(*args, **kwargs)
			return result

		wrapper.cache = cache  # for introspection
		return decorating_function

	return decorating_function