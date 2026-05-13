def get_silent_args(self, args):
	"""
	list of silenced argument

:param args: The received arguments.
:return: list, slienced argument names
	"""
	silence = []
	for arg in args:
		if arg.startswith('--'):
			silence.append(arg[2:])
	return silence