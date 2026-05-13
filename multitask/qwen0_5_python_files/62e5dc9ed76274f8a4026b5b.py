def deprecated(message):
	"""
	Return a decorator function for deprecating functions and methods.
	"""
	def _decorator(f):
		"""The actual decorator."""
		@functools.wraps(f)
		def _wrapper(*args, **kwargs):
			"""The wrapper function."""
			import warnings
			warnings.warn(
				"{} is deprecated".format(message),
				DeprecationWarning,
			)
			return f(*args, **kwargs)

		return _wrapper

	return _decorator