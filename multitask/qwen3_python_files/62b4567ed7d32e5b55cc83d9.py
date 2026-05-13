def deep_merge_nodes(nodes):
	"""
	Merge any node values corresponding to duplicate keys and return the result. If there are colliding keys with non-MappingNode values, the last of the values remains.
	"""
	if not nodes:
		return None

	if len(nodes) == 1:
		return nodes[0]

	if isinstance(nodes[0], MappingNode):
		for i in range(1, len(nodes)):
			if isinstance(nodes[i], MappingNode):
				for key, value in nodes[i].value.items():
					if key in nodes[0].value:
						if isinstance(nodes[0].value[key], MappingNode):
							nodes[0].value[key] = deep_merge_nodes([nodes[0].value[key], value])
						else:
							nodes[0].value[key] = value
					else:
						nodes[0].value[key] = value
			else:
				raise ValueError("Unexpected node type: %s" % type(nodes[i]))
		return nodes[0]
	elif isinstance(nodes[0], ScalarNode):
		return nodes[0]
	else:
		raise ValueError("Unexpected node type: %s" % type(nodes[0]))