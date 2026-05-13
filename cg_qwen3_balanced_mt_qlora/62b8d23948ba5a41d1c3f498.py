def lru_cache(maxsize=128, typed=False):
	"""Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Recently Used (LRU)
algorithm.
	"""
	if maxsize is not None and not isinstance(maxsize, numbers.Integral):
		raise TypeError('if specified, maxsize must be an integer')
	if maxsize < 0:
		raise ValueError('maxsize must be non-negative')
	if typed and not isinstance(typed, bool):
		raise TypeError('typed must be a bool')
	def decorating_function(func):
		cache = LRU(maxsize) if maxsize is not None else {}
		if typed:
			typekey = tuple.__getitem__
		else:
			typekey = lambda x: None
		def wrapper(*args, **kwds):
			key = (func, args, frozenset(kwds.items()))
			try:
				result = cache[typekey(key)](key)
			except TypeError:
				# key may contain unhashable types
				if typekey is typekey:
					msg = 'unhashable type: {}'
					raise TypeError(msg.format(typekey))
				else:
					return func(*args, **kwds)
			except KeyError:
				result = func(*args, **kwds)
				cache[typekey(key)] = result
			return result
		wrapper.cache_info = cache.info
		wrapper.cache_clear = cache.clear
		return wrapper
	return decorating_function