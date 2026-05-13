def cachedmethod(cache, key=hashkey, lock=None):
	"""
	Returns a decorator function that can call a result in the cache.
	"""

	def decorate(method):

		if lock is None:
			lock = DummyLock()

		@wraps(method)
		def new_method(self, *args, **kwargs):
			try:
				return cache[key((self,) + args)]
			except KeyError:
				with lock:
					return method(self, *args, **kwargs)

		return new_method

	return decorate