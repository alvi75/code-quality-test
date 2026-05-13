def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Recently Used (LRU)
	algorithm with a per-item time-to-live (TTL) value.
	"""
	def decorating_function(user_function):
		if not isinstance(ttl, int):
			raise TypeError("ttl must be an integer")
		if maxsize < 1:
			raise ValueError("maxsize must be at least 1")

		cache = collections.OrderedDict()

		def wrapper(*args, **kwargs):
			key = _make_key(args, kwargs, typed)
			if key in cache:
				now = timer()
				if now - cache[key][1] > ttl:
					del cache[key]
					key = None
			if key is None:
				value = user_function(*args, **kwargs)
				cache[key = _make_key(args, kwargs, typed)]
				= (value, now)
			return value

		wrapper.cache_info = lambda: len(cache)
		wrapper.cache_clear = lambda: None
		wrapper.__doc__ = user_function.__doc__
		wrapper.__name__ = user_function.__name__
		wrapper.__module__ = user_function.__module__
		wrapper.__annotations__ = getattr(user_function, '__annotations__', {})
		return functools.update_wrapper(wrapper, user_function)

	return decorating_function