def register_vcs_handler(vcs, method):
	"""
	Create decorator to mark a method as the handler of a object
	"""
	def wrapper(*args, **kwargs):
		"""
		Decorator that wraps the decorated function in a try-except block.
		If the exception is not handled by the decorated function,
		the original exception is raised.
		"""
		try:
			return method(*args, **kwargs)
		except Exception as e:
			raise e
	return wrapper