def cached(cache, key=hashkey, lock=None):
	"""
	Returns a decorator function that saves the results in the cache
	"""
	def wrapper(f):
		@wraps(f)
		def wrapped(*args, **kwargs):
			if not hasattr(f, '_cache'):
				f._cache = {}
			if not hasattr(f, '_cache_key'):
				f._cache_key = hash(key(args))
			if f._cache_key in f._cache:
				return f._cache[f._cache_key]
			result = f(*args, **kwargs)
			f._cache[f._cache_key] = result
			if lock is None:
				lock = Lock()
			with lock:
				f._cache[f._cache_key] = result
			return result
		return wrapped
	return wrapper