def cachedmethod(cache, key=_key, lock=None):
		"""
		Returns a decorator function that can call a result in the cache.
		"""
		def decorating_function(method):
			if not isinstance(cache, dict):
				raise ValueError("The first argument of @cached must be a dictionary.")

			def wrapper(self, *args, **kwargs):
				key_value = key(*args, **kwargs)
				try:
					result = cache[key_value]
				except KeyError:
					with (yield from self._get_lock(key_value, lock)):
						try:
							result = cache[key_value]
						except KeyError:
							result = method(self, *args, **kwargs)
							cache[key_value] = result
				return result

			wrapper.cache = cache
			wrapper.key = key
			wrapper.lock = lock
			return functools.update_wrapper(wrapper, method)

		return decorating_function