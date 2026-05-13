def deep_merge_nodes(nodes):
	"""
	Merge any node values corresponding to duplicate keys and return the result. If there are colliding keys with non-MappingNode values, the last of the values remains.
	"""
	if not nodes:
		return {}
	elif len(nodes) == 1:
		return nodes[0]
	else:
		result = nodes[-1].copy()
		for n in reversed(nodes[:-1]):
			for k,v in n.items():
				if isinstance(v, MappingNode):
					if k in result:
						if isinstance(result[k], MappingNode):
							result[k] = deep_merge_nodes([result[k]] + [v])
						else:
							raise ValueError("Duplicate key %s has conflicting types: %r and %r" % (k, type(result[k]), type(v)))
					else:
						result[k] = v
				else:
					result[k] = v
		return result