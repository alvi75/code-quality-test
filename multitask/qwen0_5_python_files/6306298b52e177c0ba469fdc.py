def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	"""
	result = {}
	for child in node.iter():
		if child.tag == 'xml':
			continue
		result[child.tag] = child.text or child.tail
	return result