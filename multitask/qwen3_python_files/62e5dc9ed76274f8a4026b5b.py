def deprecated(message):
	"""
	Return a decorator function for deprecating functions and methods.
	"""
	def _deprecated(func):
		"""
		Decorate a function or method to mark it as deprecated.

		Args:
			func (function): The function or method to decorate.

		Returns:
			function: The decorated function or method.
		"""

		@functools.wraps(func)
		def __deprecated(*args, **kwargs):
			"""
			Mark a function or method as deprecated.

			Args:
				*args: The arguments of the function or method.
				**kwargs: The keyword arguments of the function or method.
			"""

			if not isinstance(func, types.FunctionType) and not isinstance(func, types.MethodType):
				raise TypeError("Can only be used on functions and methods.")

			warnings.warn(
				message,
				category=DeprecationWarning,
				stacklevel=2
			)

			return func(*args, **kwargs)

		return __deprecated

	return _deprecated