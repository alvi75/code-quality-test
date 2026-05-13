def _legacy_mergeOrderings(orderings):
	"""
	Combine multiple lists in the sequence of occurrence into a list with no duplicate elements.
	"""
	ordering = []
	for orderingList in orderings:
		for orderingItem in orderingList:
			if orderingItem not in ordering:
				ordering.append(orderingItem)
	return ordering