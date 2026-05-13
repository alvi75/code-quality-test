def cached(cache, key=hashkey, lock=None):
	"""
	Returns a decorator function that saves the results in the cache
	"""
	def decorator(func):
		@wraps(func)
		def wrapper(*args, **kwargs):
			if not hasattr(wrapper, 'cache'):
				wrapper.cache = cache
			if not hasattr(wrapper, 'lock'):
				wrapper.lock = lock
			if not hasattr(wrapper, 'key'):
				wrapper.key = key
			key_ = wrapper.key(args, kwargs)
			with wrapper.lock:
				result = wrapper.cache.get(key_)
			if result is None:
				result = func(*args, **kwargs)
				with wrapper.lock:
					wrapper.cache[key_] = result
			return result
		return wrapper
	return decorator