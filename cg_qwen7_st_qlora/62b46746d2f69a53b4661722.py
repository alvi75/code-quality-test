def absorb(self, args):
	"""
	Given an `args` sequence of expressions, return a new list of expression applying absorption.
	"""
	if len(args) == 0:
		return []
	elif len(args) == 1:
		return [args[0]]
	else:
		a = args[0]
		b = args[1]

		if isinstance(a, And) or isinstance(b, And):
			if isinstance(a, And):
				if b in a.args:
					return self.absorb([a for a in a.args if a != b] + args[2:])
				else:
					return [And(*self.absorb([a] + args[2:]))] + self.absorb(args[2:])
			else:
				if a in b.args:
					return self.absorb([b for b in b.args if b != a] + args[2:])
				else:
					return [And(*self.absorb([b] + args[2:]))] + self.absorb(args[2:])
		else:
			return [a, b] + self.absorb(args[2:])