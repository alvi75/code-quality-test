def cachedmethod(cache, key=hashkey, lock=None):
	"""
	Returns a decorator function that can call a result in the cache.
	"""
	def _cache_getter(func, *args, **kwargs):
		cache_key = key(args, kwargs)
		try:
			return cache[cache_key]
		except KeyError:
			pass

		if lock is None:
			result = func(*args, **kwargs)
		else:
			with lock:
				result = func(*args, **kwargs)

		cache[cache_key] = result
		return result

	def _cache_setter(self, value):
		cache_key = key((self,), {})
		cache[cache_key] = value

	def _cache_deleter(self):
		cache_key = key((self,), {})
		del cache[cache_key]

	def _cache_has(self):
		cache_key = key((self,), {})
		return cache_key in cache

	def _cache_clear(self):
		for k in list(cache.keys()):
			if isinstance(k, tuple) and len(k) == 2 and k[0] is self:
				del cache[k]

	def decorator(method):
		method.__get__ = lambda _, __: _cache_getter(method, __)
		method.__set__ = _cache_setter
		method.__delete__ = _cache_deleter
		method.has = _cache_has
		method.clear = _cache_clear
		return method
	return decorator