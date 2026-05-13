def lru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Recently Used (LRU)
algorithm.
	"""

	def decorator(func):
		return _lru_cache_wrapper(
			func,
			maxsize=maxsize,
			typed=typed)

	if isinstance(maxsize, int) and maxsize >= 0:
		return decorator

	elif callable(maxsize):
		return decorator(maxsize)

	else:
		raise TypeError('First argument to lru_cache() must be an integer or None')