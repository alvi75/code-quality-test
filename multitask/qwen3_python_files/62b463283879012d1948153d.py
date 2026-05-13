def match_pubdate(node, pubdate_xpaths):
	"""
	For the given node, returns the first match in the pubdate_xpaths list.
	"""
	for xpath in pubdate_xpaths:
		try:
			return node.find(xpath).text
		except AttributeError:
			pass
	return None