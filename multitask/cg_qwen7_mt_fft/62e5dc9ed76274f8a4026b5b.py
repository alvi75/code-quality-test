def deprecated(message):
	"""
	Return a decorator function for deprecating functions and methods.
	"""
	def _deprecated(f):
		if inspect.isclass(f):
			docstring = f.__doc__
			f.__doc__ = _update_docstring(docstring, message)
			return f

		@functools.wraps(f)
		def new_f(*args, **kwargs):
			warnings.warn(message, DeprecationWarning, 2)
			return f(*args, **kwargs)

		docstring = f.__doc__
		new_f.__doc__ = _update_docstring(docstring, message)
		return new_f

	return _deprecated