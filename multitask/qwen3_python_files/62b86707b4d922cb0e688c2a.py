def on(self, hook):
	"""
	Return a decorator function to add a new handler to the "hook" in the registry in the class.
	"""
	def decorator(handler):
		self._registry[hook].append(handler)
		return handler
	return decorator