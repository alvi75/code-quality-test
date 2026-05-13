def on(self, hook):
	"""
	Return a decorator function to add a new handler to the "hook" in the registry in the class.
	"""
	def wrapper(f):
		self._registry[hook].append(f)
		return f
	return wrapper