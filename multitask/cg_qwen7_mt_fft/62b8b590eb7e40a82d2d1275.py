def _legacy_mergeOrderings(orderings):
	"""
	Combine multiple lists in the sequence of occurrence into a list with no duplicate elements.
	"""
	result = []
	for orderingList in orderings:
		for ordering in orderingList:
			if not ordering in result:
				result.append( ordering )
	return result