def deprecated(message):
	"""
	Return a decorator function for deprecating functions and methods.
	"""

	def _deprecated(func):

		@wraps(func)
		def new_func(*args, **kwargs):
			warnings.warn(
				message,
				category=DeprecationWarning,
				stacklevel=2
			)

			return func(*args, **kwargs)

		new_func.__doc__ = "DEPRECATED: %s" % message

		return new_func

	return _deprecated