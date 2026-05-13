def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.

:arg handle: Remote handle to retrieve
:returns: dict
	"""

	url = "https://diaspora.pl/webfinger?resource=%s" % (handle)
	response = requests.get(url, headers={'accept': 'application/jrd+json'})
	if response.status_code != 200:
		raise Exception("Error retrieving webfinger for %s: %s" % (handle, response.status_code))
	return json.loads(response.text)