def cachedmethod(cache, key=hashkey, lock=None):
	"""
	Returns a decorator function that can call a result in the cache.
	"""
	def wrapper(f):
		@wraps(f)
		def wrapped(*args, **kwargs):
			if not hasattr(f, '_cache'):
				f._cache = {}
			if key is None:
				key = hash(key)
			if lock is None:
				lock = Lock()
			with lock:
				if key in f._cache:
					return f._cache[key]
				result = f(*args, **kwargs)
				f._cache[key] = result
				return result
		return wrapped
	return wrapper