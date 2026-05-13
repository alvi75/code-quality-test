def cached(cache, key=hashkey, lock=None):
	"""
	Returns a decorator function that saves the results in the cache
	"""

	def decorator(func):

		@wraps(func)
		def wrapper(*args, **kwargs):
			if not isinstance(cache, Cache):
				raise TypeError("cache must be of type %s" % Cache.__name__)
			k = key(args, kwargs)

			try:
				return cache.get(k)
			except KeyError:
				result = func(*args, **kwargs)
				cache.set(k, result)
				return result

		return wrapper

	return decorator