def register_vcs_handler(vcs, method):
	"""
	Create decorator to mark a method as the handler of a object
	"""
	def decorate(func):
		if vcs not in _handler_map:
			_handler_map[vcs] = []
		_handler_map[vcs].append((method, func))
	return decorate