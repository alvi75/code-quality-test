def absorb(self, args):
	"""
	Given an `args` sequence of expressions, return a new list of expression applying absorption.
	"""
	if len(args) == 0:
	    return []
	elif len(args) == 1:
	    return [args[0]]
	else:
	    if self._absorbable(args):
		return [self.__class__(args).simplify()]
	    else:
		return args