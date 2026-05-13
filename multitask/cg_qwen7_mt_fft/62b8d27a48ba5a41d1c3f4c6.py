def cached(cache, key=hashkey, lock=None):
	"""
	Returns a decorator function that saves the results in the cache
	"""

	def decorator(func):

		if lock is None:
			lock = lambda x: x

		@wraps(func)
		def wrapper(*args, **kwargs):
			k = key(*args, **kwargs)

			try:
				with lock(k):
					return cache[k]
			except KeyError:
				v = func(*args, **kwargs)
				cache[k] = v
				return v

		return wrapper

	return decorator