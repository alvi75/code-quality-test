def deprecated(message):
	"""
	Return a decorator function for deprecating functions and methods.
	"""
	def _decorator(func):
		"""The actual decorator function."""
		def __decorated(*args, **kwargs):
			"""The decorated function itself."""
			warnings.warn(
				message,
				category=DeprecationWarning,
				stacklevel=2
			)
			return func(*args, **kwargs)

		return __decorated

	return _decorator