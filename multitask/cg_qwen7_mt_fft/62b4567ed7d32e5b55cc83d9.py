def deep_merge_nodes(nodes):
	"""
	Merge any node values corresponding to duplicate keys and return the result. If there are colliding keys with non-MappingNode values, the last of the values remains.
	"""
	if not isinstance(nodes, list): raise TypeError("nodes must be a list")
	result = {}
	for n in nodes:
		if not isinstance(n, NodeDeclaration): raise TypeError("Invalid object '%s' found inside 'nodes', it should be a NodeDeclaration" % str(n))
		for k,v in iteritems(n.node):
			if k in result: 
				if type(result[k]) != dict or type(n.node[k]) != dict: continue # Only merge if both items are MappingNodes
				result[k] = deep_merge_nodes([result[k],n.node[k]])
			else: result[k] = copy.deepcopy(n.node[k])
	return result