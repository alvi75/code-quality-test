def deep_merge_nodes(nodes):
	"""
	Merge any node values corresponding to duplicate keys and return the result. If there are colliding keys with non-MappingNode values, the last of the values remains.
	"""

	if not nodes:
		return None

	result = nodes[0]
	for n in nodes[1:]:
		if isinstance(result, MappingNode) and isinstance(n, MappingNode):
			result.value.update(n.value)
		else:
			result = n
	return result