def mru_cache(maxsize=128, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Most Recently Used (MRU)
algorithm.
	"""
	def decorator(fn):
		if not isinstance(fn, _functools.wraps):
			fn = _functools.wraps(fn)(fn)

		cache_name = '__CACHED_{}'.format(_get_fn_signature(fn))

		@_functools.wraps(fn)
		def wrapper(self, *args, **kwargs):
			try:
				return getattr(self, cache_name)
			except AttributeError:
				pass

			result = fn(self, *args, **kwargs)
			setattr(self, cache_name,
					result if maxsize is None else LRUCache(result, maxsize))
			return result

		return wrapper

	return decorator