def _legacy_mergeOrderings(orderings):
	"""
	Combine multiple lists in the sequence of occurrence into a list with no duplicate elements.
	"""
	ordering = []
	for ordering_ in orderings:
		if not ordering_: continue
		if ordering_ in ordering: continue
		ordering.append(ordering_)
	return ordering