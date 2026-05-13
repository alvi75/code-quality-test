def absorb(self, args):
	"""
	Given an `args` sequence of expressions, return a new list of expression applying absorption.
	"""
	args = list(args)
	while len(args) > 1:
		for i in range(0, len(args), 2):
			if isinstance(args[i], Expression) and isinstance(args[i+1], Expression):
				args[i] = args[i].absorb(args[i+1])
	return args