def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Frequently Used (LFU)
algorithm.
	"""

	def decorator(func):
		return wraps(func)(LRUCacheWrapper(func, maxsize, typed))

	return decorator