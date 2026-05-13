def _legacy_mergeOrderings(orderings):
	"""
	Combine multiple lists in the sequence of occurrence into a list with no duplicate elements.
	"""
	if not orderings:
		return []
	
	result = [orderings[0]]
	for ordering in orderings[1:]:
		newResult = []
		for o in result:
			if o not in ordering:
				newResult.append(o)
		for o in ordering:
			if o not in newResult:
				newResult.append(o)
		result = newResult
	
	return result