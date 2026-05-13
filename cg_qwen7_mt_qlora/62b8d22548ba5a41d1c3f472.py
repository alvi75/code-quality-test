def cachedmethod(cache, key=hashkey, lock=None):
	"""
	Returns a decorator function that can call a result in the cache.
	"""
	def decorator(func):
		if not isinstance(cache, AbstractCache):
			raise TypeError('cache must be an instance of AbstractCache')

		@wraps(func)
		def wrapper(self, *args, **kwargs):
			cache_key = key(self, args, kwargs)

			try:
				result = cache.get(cache_key)
			except KeyError:
				with _lock(lock):
					try:
						result = cache.get(cache_key)
					except KeyError:
						result = func(self, *args, **kwargs)
						cache.set(cache_key, result)
			return result

		return wrapper
	return decorator