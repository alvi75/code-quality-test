def lru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Recently Used (LRU)
algorithm.
	"""

	if maxsize < 0:
		raise ValueError('maxsize must be non-negative')

	def decorator(func):

		if not isinstance(maxsize, int) or maxsize < 0:
			raise TypeError("Expected maxsize to be an integer >= 0")

		if not isinstance(typed, bool):
			raise TypeError("Expected typed to be boolean")

		memory = OrderedDict()
		hits = misses = 0

		@wraps(func)
		def wrapper(*args, **kwargs):
			nonlocal hits, misses
			key = args
			if typed:
				if not all(isinstance(arg, Hashable) for arg in args):
					# We can't cache this call because it has a mutable object as an argument.
					return func(*args, **kwargs)

				key += tuple(kwargs.items())
			elif not kwargs:
				# Since (args, kwargs) is used directly as a dictionary key, we only
				# use args if there are no kwargs.
				key = args

			if key in memory:
				hits += 1
				return memory[key]
			else:
				misses += 1
				result = func(*args, **kwargs)
				memory[key] = result
				if len(memory) > maxsize:
					memory.popitem(last=False)
				return result

		wrapper.cache_clear = _make_cache_clearer(memory, hits, misses)
		wrapper.hits = lambda: hits
		wrapper.misses = lambda: misses
		return wrapper

	return decorator