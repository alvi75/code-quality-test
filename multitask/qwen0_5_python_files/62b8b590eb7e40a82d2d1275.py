def _legacy_mergeOrderings(orderings):
	"""
	Combine multiple lists in the sequence of occurrence into a list with no duplicate elements.
	"""
	orderings = [list(x) for x in orderings]
	orderings = [[x[0] for x in y] for y in orderings]
	orderings = [set(x) for x in orderings]
	orderings = [list(x) for x in orderings]
	orderings = [sorted(x, key=lambda x: (x[1], x[2])) for x in orderings]
	orderings = [tuple(x) for x in orderings]
	return orderings