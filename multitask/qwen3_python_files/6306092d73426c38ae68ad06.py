def get_silent_args(self, args):
	"""
	definition of silent arguments

:param args: The received arguments.
:return: list, slienced argument names
	"""
	silent = []
	for arg in self.silent:
		if hasattr(args, arg):
			silent.append(arg)
	return silent