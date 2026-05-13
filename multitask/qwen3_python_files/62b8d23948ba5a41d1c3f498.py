def lru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm.
	"""
	def decorating_function(user_function):
		if not isinstance(maxsize, int) or maxsize < 0:
			raise ValueError("maxsize must be a non-negative integer")
		if maxsize == 0:
			cache = None
		else:
			from collections import OrderedDict as _OrderedDict
			cache = _OrderedDict()
		def wrapper(*args, **kwds):
			key = _make_key(args, kwds, typed)
			try:
				return cache[key]
			except KeyError:
				pass
			except TypeError:
				# Can't cache key for this object
				pass
			# We don't know what this object is, nor whether it can be hashed.
			# Store it at least so we don't discard it.
			if cache is not None:
				cache[key] = result = user_function(*args, **kwds)
			return result
		wrapper.cache_info = lambda: cache_info(maxsize, len(cache))
		wrapper.cache_clear = lambda: cache.clear() if cache is not None else None
		wrapper.__doc__ = user_function.__doc__
		wrapper.__name__ = user_function.__name__
		wrapper.__module__ = user_function.__module__
		wrapper.__annotations__ = getattr(user_function, '__annotations__', {})
		return update_wrapper(wrapper, user_function)
	return decorating_function