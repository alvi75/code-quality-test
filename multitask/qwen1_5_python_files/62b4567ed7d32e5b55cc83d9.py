def deep_merge_nodes(nodes):
	"""
	Merge any node values corresponding to duplicate keys and return the result. If there are colliding keys with non-MappingNode values, the last of the values remains.
	"""
	if not isinstance(nodes[0], MappingNode):  # pragma: no cover
		raise ValueError("deep_merge_nodes() expects a list of MappingNodes")
	result = nodes[0].copy()
	for node in nodes[1:]:
		for key, value in node.items():
			if key in result:
				value = deep_merge_nodes((result[key], value))
			result[key] = value
	return result