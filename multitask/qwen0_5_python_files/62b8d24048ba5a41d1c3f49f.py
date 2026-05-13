def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Recently Used (LRU)
algorithm with a per-item time-to-live (TTL) value.
	"""
	def _memoize(f):
		"""The actual decorator."""
		# pylint: disable=missing-docstring
		@wraps(f)
		def wrapper(*args, **kwargs):
			"""The wrapped function."""
			if not hasattr(wrapper, '_cache'):
				wrapper._cache = {}
				wrapper._last_access = timer()
				wrapper._misses = 0

			if f in wrapper._cache:
				del wrapper._cache[f]
				wrapper._misses += 1
				return wrapper._cache[f]

			result = f(*args, **kwargs)

			if result is None:
				del wrapper._cache[f]
				wrapper._misses += 1
				return None

			if typed:
				wrapper._cache[f] = result
				wrapper._last_access = timer()

			else:
				wrapper._cache[f] = (result, timer())
				wrapper._last_access = wrapper._cache[f][1]

			wrapper._misses = 0
			return result

		return wrapper

	return _memoize