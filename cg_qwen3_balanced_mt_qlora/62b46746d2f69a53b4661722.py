def absorb(self, args):
		"""
		Given an `args` sequence of expressions, return a new list of expression applying absorption.
		"""
		if len(args) == 1:
			return args[0]
		else:
			return self.__class__(self.op, *args)