def absorb(self, args):
	"""
	Given an `args` sequence of expressions, return a new list of expression applying absorption.
	"""
	return [a for a in args if not self.iszero(a) and not self.isone(a)]