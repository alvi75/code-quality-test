def get_silent_args(self, args):
	"""
	list of silenced argument

:param args: The received arguments.
:return: list, slienced argument names
	"""
	silent = []
	for arg in self.args:
		if not getattr(arg, 'silence', False):
			silent.append(arg.name)
	return silent