def deprecated(message):
	"""
	Return a decorator function for deprecating functions and methods.
	"""

	def deco(func):
		@functools.wraps(func)
		def wrapper(*args, **kwargs):
			warnings.warn(
				message,
				DeprecationWarning,
				stacklevel=2
			)
			return func(*args, **kwargs)

		return wrapper

	return deco