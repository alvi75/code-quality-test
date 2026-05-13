def match_pubdate(node, pubdate_xpaths):
	"""
	For the given node, returns the first match in the pubdate_xpaths list.
	"""
	for xpath in pubdate_xpaths:
		match = node.xpath(xpath)
		if len(match) > 0:
			return match[0].text
	return None