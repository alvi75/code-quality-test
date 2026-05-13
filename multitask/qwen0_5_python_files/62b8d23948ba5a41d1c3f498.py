def lru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Recently Used (LRU)
algorithm.
	"""
	def decorator(f):
		"""The actual decorator."""
		# pylint: disable=missing-docstring

		@wraps(f)
		def wrapper(*args, **kwargs):
			"""The wrapped function."""
			# pylint: disable=missing-docstring
			if not hasattr(wrapper, '_memoized_results'):
				wrapper._memoized_results = {}
				wrapper._memoized_keys = set()
			else:
				wrapper._memoized_keys = wrapper._memoized_keys.union(kwargs.keys())
			key = _get_key(args, kwargs)

			if key in wrapper._memoized_results:
				return wrapper._memoized_results[key]
			result = f(*args, **kwargs)
			wrapper._memoized_results[key] = result
			wrapper._memoized_keys.difference_update(key)
			if len(wrapper._memoized_keys) > maxsize:
				del wrapper._memoized_results[wrapper._memoized_keys.pop()]
			return result
		return wrapper
	return decorator