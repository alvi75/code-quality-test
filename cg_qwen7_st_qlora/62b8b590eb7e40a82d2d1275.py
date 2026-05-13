def _legacy_mergeOrderings(orderings):
	"""
	Combine multiple lists in the sequence of occurrence into a list with no duplicate elements.
	"""
	if not orderings:
		return []
	elif len(orderings) == 1:
		return orderings[0]
	else:
		result = []
		for ordering in orderings:
			for element in ordering:
				if element not in result:
					result.append(element)
		return result