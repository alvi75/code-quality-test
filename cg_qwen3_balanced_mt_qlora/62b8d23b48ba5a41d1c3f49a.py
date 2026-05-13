def mru_cache(maxsize=128, typed=False):
	"""Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Most Recently Used (MRU)
algorithm.
	"""
	if maxsize is None:
		maxsize = 128
	if not isinstance(maxsize, int) or maxsize <= 0:
		raise ValueError('maxsize must be an integer > 0')
	if typed and not isinstance(typed, bool):
		raise TypeError('typed must be boolean')
	def decorating_function(func):
		cache = LRU(maxsize=maxsize, typed=typed)
		if not hasattr(cache, 'cache_info'):
			# cache_info() is new in Python 3.4
			cache.cache_info = lambda: ('cache_info', {})
		def wrapper(*args, **kwargs):
			key = args
			if kwargs:
				key += tuple(sorted(kwargs.items()))
			try:
				return cache[key]
			except KeyError:
				result = func(*args, **kwargs)
				cache[key] = result
				return result
		wrapper.cache_info = cache.cache_info
		wrapper.cache_clear = cache.clear
		return wrapper
	return decorating_function