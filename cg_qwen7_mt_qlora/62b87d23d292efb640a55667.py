def register_vcs_handler(vcs, method):
	"""
	Create decorator to mark a method as the handler of a object
	"""
	def wrapper(*args, **kwargs):
		return method(*args, **kwargs)
	wrapper.vcs = vcs
	return wrapper