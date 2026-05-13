def on(self, hook):
		"""
		Return a decorator function to add a new handler to the "hook" in the registry in the class.
		"""
		def register(func):
			if not hasattr(self.registry, hook):
				self.registry.__dict__[hook] = []
			self.registry.__dict__[hook].append(func)
			return func
		return register