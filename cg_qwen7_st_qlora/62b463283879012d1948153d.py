def match_pubdate(node, pubdate_xpaths):
	"""
	For the given node, returns the first match in the pubdate_xpaths list.
	"""
	for xpath in pubdate_xpaths:
		pubdate = node.xpath(xpath)
		if len(pubdate) > 0:
			return pubdate[0]
	return None