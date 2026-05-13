def _legacy_mergeOrderings(orderings):
	"""
	Combine multiple lists in the sequence of occurrence into a list with no duplicate elements.
	"""
	result = []
	for ordering in orderings:
		for item in ordering:
			if item not in result:
				result.append(item)
	return result