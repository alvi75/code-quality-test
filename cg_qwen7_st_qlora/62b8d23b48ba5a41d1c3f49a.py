def mru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Most Recently Used (MRU)
algorithm.
	"""

	def decorator(func):
		cache = OrderedDict()
		hits = misses = 0

		if isinstance(maxsize, int) and maxsize < 1:
			raise ValueError('maxsize must be positive or zero')

		elif isinstance(maxsize, int):

			def get_key(*args, **kwds):
				# Make a unique key from arguments to hash; order does not matter
				# since MRU cache is order-sensitive.
				key = args
				if kwds:
					key += tuple(sorted(kwds.items()))
				return key if typed else makekey(key)

		else:

			get_key = func

		def wrapper(*args, **kwds):
			nonlocal hits, misses
			# Avoid PEP 467 optimization so we can intercept *args and **kwds.
			key = get_key(args)
			if key in cache:
				cache.move_to_end(key)
				hits += 1
				return cache[key]
			else:
				misses += 1
				result = func(*args, **kwds)
				cache[key] = result
				if len(cache) > maxsize:
					cache.popitem(last=True)
				return result

		wrapper.cache_info = _lru_cache_wrapper(wrapper, cache, hits, misses)
		wrapper.cache_clear = cache.clear
		return update_wrapper(wrapper, func)

	return decorator