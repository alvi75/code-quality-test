def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	"""
	d = {}
	for child in node:
		d[child.tag] = child.text
	return d