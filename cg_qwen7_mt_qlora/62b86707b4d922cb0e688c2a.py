def on(self, hook):
	"""
	Return a decorator function to add a new handler to the "hook" in the registry in the class.
	"""
	def decorator(func):
		self._registry[hook].append(func)
		return func

	return decorator