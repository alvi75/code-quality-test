def register_vcs_handler(vcs, method):
	"""
	Create decorator to mark a method as the handler of a object
	"""
	if not hasattr(vcs, 'handlers'):
		vcs.handlers = {}
	vcs.handlers[method] = vcs

	return method