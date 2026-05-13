def cached(cache, key=hashkey, lock=None):
	"""
	Returns a decorator function that saves the results in the cache
	"""

	def decorator(func):

		@wraps(func)
		def wrapper(*args, **kwargs):
			k = key(args, kwargs)

			if not isinstance(k, str):
				raise TypeError("Cache keys must be strings")

			result = cache.get(k)

			if result is None:
				with lock or nullcontext():
					result = func(*args, **kwargs)
					cache.set(k, result)

			return result

		return wrapper

	return decorator