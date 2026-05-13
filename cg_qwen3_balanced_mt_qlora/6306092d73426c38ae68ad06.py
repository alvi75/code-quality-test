def get_silent_args(self, args):
	"""
	list of silenced argument

:param args: The received arguments.
:return: list, slienced argument names
	"""
	silent = []
	for arg in args:
		if arg.startswith('-'):
			if arg[1:] in self.silent_args:
				silent.append(arg)
	return silent