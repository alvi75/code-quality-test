def lfu_cache(maxsize=128, typed=False):
	"""Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Frequently Used (LFU)
algorithm.
	"""
	if maxsize is None:
		maxsize = 128
	if not isinstance(maxsize, int) or maxsize <= 0:
		raise ValueError('maxsize must be an integer > 0')
	if typed and not isinstance(typed, bool):
		raise TypeError('typed must be boolean')
	def decorating_function(func):
		cache = LfuCache(maxsize=maxsize, typed=typed)
		if not hasattr(cache, '_cache'):
			cache._cache = {}
		if not hasattr(cache, '_counters'):
			cache._counters = {}
		if not hasattr(cache, '_lock'):
			cache._lock = threading.Lock()
		def wrapper(*args, **kwargs):
			key = _make_key(args, kwargs, typed)
			with cache._lock:
				try:
					value = cache._cache[key]
					cache._counters[key] += 1
				except KeyError:
					value = func(*args, **kwargs)
					cache._cache[key] = value
					cache._counters[key] = 1
			return value
		wrapper.cache_clear = cache.clear
		wrapper.cache_info = cache.info
		wrapper.cache_keys = cache.keys
		return wrapper
	return decorating_function