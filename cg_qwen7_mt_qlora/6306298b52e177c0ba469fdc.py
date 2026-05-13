def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	"""
	d = {}
	for child in node:
		if child.tag not in d:
			d[child.tag] = []
		d[child.tag].append(child)
	return d