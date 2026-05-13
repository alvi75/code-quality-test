def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Recently Used (LRU)
algorithm with a per-item time-to-live (TTL) value.
	"""
	if maxsize is None:
		maxsize = sys.maxsize

	if not isinstance(maxsize, int):
		raise TypeError('maxsize must be an integer')

	if maxsize < 0:
		raise ValueError('maxsize must be >= 0')

	if not isinstance(ttl, int):
		raise TypeError('ttl must be an integer')

	if ttl < 0:
		raise ValueError('ttl must be >= 0')

	if not isinstance(typed, bool):
		raise TypeError('typed must be a bool')

	def wrapper(func):
		cache = LRUCache(maxsize=maxsize, typed=typed)

		@functools.wraps(func)
		def wrapped(*args, **kwargs):
			key = _make_key(args, kwargs, typed)
			value = cache.get(key)
			if value is None:
				value = func(*args, **kwargs)
				cache.set(key, value, ttl=ttl)
			return value

		return wrapped

	return wrapper