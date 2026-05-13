def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.

:arg handle: Remote handle to retrieve
:returns: dict
	"""
	url = 'https://diaspora.com/profile/' + handle + '/.well-known/webfinger'
	response = requests.get(url)
	if response.status_code == 200:
		return json.loads(response.text)
	else:
		raise Exception('Error retrieving WebFinger for %s' % (handle))