def register_vcs_handler(vcs, method):
		"""
		Create decorator to mark a method as the handler of a object
		"""
		def wrapper(self, *args, **kwargs):
			return self._call_method(method, *args, **kwargs)
		return wrapper

	return register_vcs_handler