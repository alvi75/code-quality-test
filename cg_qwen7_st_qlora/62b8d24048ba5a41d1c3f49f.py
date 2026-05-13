def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Recently Used (LRU)
algorithm with a per-item time-to-live (TTL) value.
	"""

	def wrapper(func):

		if not isinstance(maxsize, int) or maxsize < 0:
			raise TypeError('maxsize must be an integer')
		if not isinstance(ttl, (int, float)) or ttl < 0:
			raise TypeError('ttl must be a positive number')

		cache = OrderedDict()
		timestamps = {}

		def _cache_get(key):
			try: return cache[key]
			except KeyError: pass

		def _cache_set(key, value):
			cache[key] = value
			timestamps[key] = timer()

		def _cache_pop(key):
			del cache[key], timestamps[key]

		def _isexpired(key):
			expiretime = timestamps.get(key)
			return expiretime is None or timer() - expiretime > ttl

		def cached_func(*args, **kwargs):
			# We calculate the hash outside of the lock because we assume it's an expensive call
			key = args + tuple(sorted(kwargs.items())) if typed else args
			with _lock:
				result = _cache_get(key)

				if result is not None:
					if _isexpired(key):
						_cache_pop(key)
					else:
						return result

				result = func(*args, **kwargs)
				_cache_set(key, result)
				if len(cache) > maxsize:
					for key in list(cache.keys()):
						if _isexpired(key):
							_cache_pop(key)
						else:
							break
			return result

		cached_func.cache_info = _make_key_stats_info
		cached_func.cache_clear = _make_key_cache_clear(cache, timestamps, _cache_set, _cache_pop)
		return update_wrapper(cached_func, func)

	return wrapper