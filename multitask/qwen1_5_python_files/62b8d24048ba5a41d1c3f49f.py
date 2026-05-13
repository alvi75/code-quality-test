def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
	up to `maxsize` results based on a Least Recently USED (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def decorating_function(cached_wrapper):
		def wrapper(*args, **kwargs):
			cache = cached_wrapper.__cache__
			key = args + tuple(sorted(kwargs.items()))
			if len(cache) >= maxsize:
				cache.clear()
			elif key not in cache or cache[key].expired():
				result = cached_wrapper(*args, **kwargs)
				cache[key] = TTLValue(ttl, result)
			else:
				result = cache[key].value
			return result

		wrapper.cache = cache  # for introspection
		wrapper.memoize_clear = lambda: cache.clear()  # for testing
		wrapper.memoize_key = _memoize_key  # for testing
		wrapper.memoize_ttl = ttl  # for testing
		wrapper.memoize_timer = timer  # for testing
		wrapper.memoize_typed = typed  # for testing
		return functools.update_wrapper(wrapper, cached_wrapper)

	return decorating_function