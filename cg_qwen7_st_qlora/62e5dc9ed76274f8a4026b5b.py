def deprecated(message):
	"""
	Return a decorator function for deprecating functions and methods.
	"""

	def _decorator(func):

		@functools.wraps(func)
		def wrapper(*args, **kwargs):
			warnings.warn(
				message,
				category=DeprecationWarning,
				stacklevel=2
			)

			return func(*args, **kwargs)

		return wrapper

	return _decorator