def match_pubdate(node, pubdate_xpaths):
	"""
	For the given node, returns the first match in the pubdate_xpaths list.
	"""
	for xpath in pubdate_xpaths:
		match = re.search(xpath, str(node))
		if match:
			return match.group(1)
	return None