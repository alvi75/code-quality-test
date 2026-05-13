def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Frequently Used (LFU)
algorithm.
	"""

	if maxsize < 0:
		raise ValueError('maxsize must be non-negative')

	def decorator(func):

		if not isinstance(maxsize, int) or maxsize < 0:
			raise TypeError("maxsize must be None or an integer >= 0")

		if not callable(func):
			raise TypeError("func must be callable")

		func = _lru_cache_wrapper(func)

		func.cache_info = _lfu_cache_info
		func.cache_clear = _lfu_cache_clear

		return func

	return decorator