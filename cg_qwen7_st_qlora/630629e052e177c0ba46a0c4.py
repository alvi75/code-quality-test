def parse_diaspora_webfinger(document: str) -> Dict:
	"""
	The webfinger is obtained by reading the document in JSON format, the value of hcard_url in the webfinger is the value of href in links in the document.
	"""

	document = json.loads(document)
	for link in document.get('links', []):
		if link['rel'] == 'http://microformats.org/profile/hCard':
			return {'hcard_url': link['href']}
	raise DiasporaError("No hCard URL found")