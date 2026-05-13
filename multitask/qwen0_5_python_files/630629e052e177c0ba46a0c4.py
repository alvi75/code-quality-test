def parse_diaspora_webfinger(document: str) -> Dict:
	"""
	The webfinger is obtained by reading the document in JSON format, the value of hcard_url in the webfinger is the value of href in links in the document.
	"""
	try:
		data = json.loads(document)
	except ValueError as e:
		raise ValueError("Could not parse JSON from %s" % document)

	if "hcard_url" not in data or "href" not in data["hcard_url"]:
		raise ValueError("Could not find hcard_url")

	return {
		"name": data["name"],
		"url": data["hcard_url"]["href"]
	}