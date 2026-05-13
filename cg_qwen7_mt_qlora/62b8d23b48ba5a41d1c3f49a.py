def mru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Most Recently Used (MRU)
algorithm.
	"""

	if maxsize < 0:
		raise ValueError('maxsize must be non-negative')

	def decorator(func):

		memo = MRUCache(maxsize=maxsize, typed=typed)

		@wraps(func)
		def wrapper(*args, **kwds):
			key = args
			if kwds:
				# freeze kwds into a sorted tuple of key/value pairs
				extra_args = []
				for item in sorted(kwds.items()):
					extra_args.append(item[0])
					extra_args.append(item[1])
				key += tuple(extra_args)
			result = memo[key]
			return result

		wrapper.cache_clear = memo.clear
		return wrapper

	return decorator