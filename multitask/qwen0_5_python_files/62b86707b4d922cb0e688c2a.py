def on(self, hook):
	"""
	Return a decorator function to add a new handler to the "hook" in the registry in the class.
	"""
	def wrapper(func):
		self._hooks[hook] = func
		return func
	return wrapper