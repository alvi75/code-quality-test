def parse_diaspora_webfinger(document: str) -> Dict:
	"""
	The webfinger is obtained by reading the document in JSON format, the value of hcard_url in the webfinger is the value of href in links in the document.
	"""
	try:
		diaspora = json.loads(document)
	except ValueError:
		raise ValueError("Could not decode document as JSON")
	if 'hcard_url' not in diaspora:
		raise KeyError("No hcard_url found in document")
	return diaspora