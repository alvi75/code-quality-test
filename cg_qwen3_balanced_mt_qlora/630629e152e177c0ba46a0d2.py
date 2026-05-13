def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.

:arg handle: Remote handle to retrieve
	:returns: dict
	"""
	url = 'https://diaspora.com/.well-known/webfinger?resource=acct:%s' % handle
	return _retrieve_and_parse(url)