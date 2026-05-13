def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	"""
	return {c.tag: c.text for c in list(node) if c.text}