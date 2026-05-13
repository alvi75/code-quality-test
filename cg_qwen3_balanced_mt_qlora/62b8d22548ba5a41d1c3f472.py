def cachedmethod(cache, key=hashkey, lock=None):
	"""
	Returns a decorator function that can call a result in the cache.
	"""
	def decorator(func):
		@functools.wraps(func)
		def wrapper(*args, **kwargs):
			key = key(args, kwargs)
			if not cache.has(key):
				with lock:
					if not cache.has(key): # double check locking
						cache.set(key, func(*args, **kwargs))
			return cache.get(key)
		return wrapper
	return decorator