def mru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Most Recently Used (MRU)
algorithm.
	"""
	def decorating_function(user_function):
		if not isinstance(maxsize, int) or maxsize < 0:
			raise ValueError("maxsize must be a non-negative integer")
		if not isinstance(typed, bool):
			raise TypeError("typed must be a boolean")

		cache = collections.OrderedDict()

		def wrapper(*args, **kwargs):
			key = _make_key(args, kwargs, typed)
			try:
				return cache[key]
			except KeyError:
				pass
			except TypeError:
				# unhashable type: 'list'
				result = user_function(*args, **kwargs)
				cache[key] = result
				return result

		def clear():
			cache.clear()

		wrapper.cache_info = lambda: len(cache)
		wrapper.cache_clear = clear
		wrapper.maxsize = maxsize
		wrapper.mru = lambda: list(cache.keys())[-1]

		return functools.update_wrapper(wrapper, user_function)

	return decorating_function