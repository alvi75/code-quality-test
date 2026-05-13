def absorb(self, args):
	"""
	Given an `args` sequence of expressions, return a new list of expression applying absorption.
	"""
	if not isinstance(args, (list, tuple)):
		args = [args]
	return [self.absorb(arg) for arg in args]