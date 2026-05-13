def ttl_cache(maxsize=128, ttl=600, timer=time.monotonic, typed=False):
	"""
	Decorator to wrap a function with a memoizing callable that saves
up to `maxsize` results based on a Least Recently Used (LRU)
algorithm with a per-item time-to-live (TTL) value.
	"""

	def decorator(func):

		ttl = max(5, ttl)

		if not isinstance(ttl, int):
			raise TypeError('ttl argument must be integer')

		if ttl < 5:
			warnings.warn(
				'ttl less than 5 is now deprecated and will be removed in future versions',
				DeprecationWarning,
				stacklevel=3
			)

		timer = functools.wraps(timer)(functools.partial(int, timer()))

		cache = TTLMappingWrapper(
			maxsize=maxsize,
			ttl=ttl,
			timer=timer,
			key_fn=_key_argcount_tuple,
			get_timer=functools.partial(get_timer, timer),
			misses=[],
			typed=typed,
		)

		@wraps(func)
		def wrapper(*args, **kwargs):
			return cache[args]

		return update_wrapper(wrapper, func)

	return decorator