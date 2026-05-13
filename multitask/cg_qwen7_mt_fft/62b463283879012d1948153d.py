def match_pubdate(node, pubdate_xpaths):
	"""
	For the given node, returns the first match in the pubdate_xpaths list.
	"""
	for xpath in pubdate_xpaths:
		try:
			return node.xpath(xpath)[0].text_content()
		except IndexError:
			continue

	return None