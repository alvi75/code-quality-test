def deep_merge_nodes(nodes):
	"""
	Merge any node values corresponding to duplicate keys and return the result. If there are colliding keys with non-MappingNode values, the last of the values remains.
	"""
	if not nodes:
		return None

	# Sort by key so that we can merge in order
	nodes = sorted(nodes, key=lambda n: n.key)

	# Merge all nodes together
	result = {}
	for node in nodes:
		if node.key in result:
			result[node.key] = deep_merge(result[node.key], node.value)
		else:
			result[node.key] = node.value

	return result