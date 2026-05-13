def deep_merge_nodes(nodes):
	"""
	Merge any node values corresponding to duplicate keys and return the result. If there are colliding keys with non-MappingNode values, the last of the values remains.
	"""
	result = {}
	for n in nodes:
		if isinstance(n, MappingNode):
			result.update(n.items())
		elif isinstance(n, (list, tuple)):
			result.append(deep_merge_nodes(n))
		else:
			result[n] = deepcopy(n)
	return result