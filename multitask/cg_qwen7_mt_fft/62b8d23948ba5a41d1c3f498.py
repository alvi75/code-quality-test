def lru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Recently Used (LRU)
algorithm.
	"""
	if maxsize < 0:
		raise ValueError("lru_cache: invalid value for maximum size %r" % maxsize)

	def decorating_function(user_function, hits=0, misses=0):

		times = [None]

		def wrapper(*args, **kwds):
			# Remember previous times, in order from oldest to newest.
			times.append(time.time())

			key = args[1:] if typed else args
			result = user_function(*args, **kwds)
			return result

		wrapper.cache_info = _make_cache_info(hits, misses, len(times) - 1,
											   maxsize, False, typed)
		wrapper.cache_clear = lambda: wrapper.cache_info()
		return update_wrapper(wrapper, user_function)

	return decorating_function