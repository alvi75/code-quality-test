def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least frequently Used (LFU)
	(algorithm).
	"""
	cache = LRUCache(maxsize=maxsize)

	def decorating_function(func):
		if not hasattr(func, '__wrapped__'):
			func.__wrapped__ = func

		@functools.wraps(func)
		def wrapper(*args, **kwargs):
			key = _key(args, kwargs) if typed else args
			try:
				result = cache[key]
			except KeyError:
				result = func(*args, **kwargs)
				cache[key] = result
			return result

		return wrapper

	return decorating_function