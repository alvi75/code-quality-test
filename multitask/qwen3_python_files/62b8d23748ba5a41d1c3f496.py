def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Frequently Used (LFU)
algorithm.
	"""
	def decorating_function(user_function):
		cache = LRUCache(maxsize=maxsize, typed=typed)
		return cache(user_function)

	return decorating_function