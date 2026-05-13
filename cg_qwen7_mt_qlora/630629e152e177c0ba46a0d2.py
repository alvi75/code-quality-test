def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.

:arg handle: Remote handle to retrieve
:returns: dict

	"""
	handle = handle.strip()
	if not handle:
		return None
	try:
		doc = urlopen('https://diasp.org/diaspora/webfinger?resource={}'.format(quote_plus(handle)))
	except HTTPError as e:
		if e.code == 404:
			return None
		else:
			raise
	data = doc.read().decode(doc.headers.get_content_charset())
	doc.close()

	dom = xml.dom.minidom.parseString(data)
	result = {}
	for link in dom.getElementsByTagName("link"):
		if link.getAttribute("rel") == "http://microformats.org/profile/hcard":
			result["hcard"] = link.getAttribute("href")
		elif link.getAttribute("rel") == "http://schemas.google.com/g/2010/toy":
			result["profile"] = link.getAttribute("href")

	return result