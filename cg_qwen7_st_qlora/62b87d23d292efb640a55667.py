def register_vcs_handler(vcs, method):
	"""
	Create decorator to mark a method as the handler of a object
	"""

	def wrapper(func):
		if not hasattr(method, 'vcs_handlers'):
			method.vcs_handlers = {}
		method.vcs_handlers[vcs] = func

		return func

	return wrapper