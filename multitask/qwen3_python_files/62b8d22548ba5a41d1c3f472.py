def cachedmethod(cache, key=hashkey, lock=None):
	"""
	Returns a decorator function that can call a result in the cache.
	"""
	def decorator(func):
		@functools.wraps(func)
		def wrapper(self, *args, **kwargs):
			if not hasattr(self, '_cache'):
				self._cache = cache()
			key_ = key(*args, **kwargs)
			result = self._cache.get(key_)
			if result is None:
				result = func(self, *args, **kwargs)
				self._cache[key_] = result
			return result
		return wrapper
	return decorator