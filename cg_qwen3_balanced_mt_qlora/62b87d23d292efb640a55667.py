def register_vcs_handler(vcs, method):
	"""
	Create decorator to mark a method as the handler of a object
	"""
	def decorator(func):
		if not hasattr(func, 'vcs'):
			func.vcs = []
		func.vcs.append((vcs, method))
		return func
	return decorator