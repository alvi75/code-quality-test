def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Frequently Used (LFU)
algorithm.
	"""

	def decorating_function(user_function):

		if maxsize is None:
			return user_function

		cache = {}
		hits = misses = 0
		timestamps = {}

		def get_timestamp():
			now = time.time()
			for key in list(timestamps.keys()):
				if timestamps[key] < now - MAX_TTL:
					del cache[key]
					del timestamps[key]

			timestamps.setdefault(user_function, now)

		def wrapper(*args, **kwds):
			get_timestamp()

			key = args
			if kwds:
				key += tuple(sorted(kwds.items()))
			elif typed:
				key += (type(x) for x in args)

			try:
				result = cache[key]
				hits += 1
				return result
			except KeyError:
				misses += 1
				result = user_function(*args, **kwds)
				cache[key] = result
				timestamps[user_function] = time.time()
				if len(cache) > maxsize:
					lru.popitem(last=False)
				return result

		wrapper.cache_info = _lru_cache_wrapper(wrapped=user_function,
												hits=hits, misses=misses,
												maxsize=maxsize, currsize=len(cache))
		wrapper.cache_clear = cache.clear
		return update_wrapper(wrapper, user_function)

	return decorating_function