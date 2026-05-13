def lfu_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Frequently Used (LFU)
algorithm.
	"""
	def wrapper(f):
		"""Wrapper for decorating functions."""
		# pylint: disable=missing-docstring
		@wraps(f)
		def wrapped(*args, **kwargs):
			"""Wrapper for decorating functions."""
			if not hasattr(wrapped, '_cache'):
				wrapped._cache = {}
				wrapped._cache_size = 0

			if len(wrapped._cache) > maxsize:
				del wrapped._cache[0]
			wrapped._cache_size += 1
			return f(*args, **kwargs)

		# pylint: enable=missing-docstring
		wrapped._cache = {}
		wrapped._cache_size = 0
		return wrapped
		return wrapper