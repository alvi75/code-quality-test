def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.

:arg handle: Remote handle to retrieve
:returns: dict

	"""

	handle = handle.strip()
	if not handle:
		raise ValueError("Handle is empty")

	try:
		domain, localpart = handle.split("@")
	except ValueError as e:
		raise ValueError("Invalid handle format") from e

	resource = "https://{domain}/.well-known/webfinger?resource={handle}".format(
		domain=domain,
		handle=quote_plus("acct:{0}@{1}".format(localpart, domain))
	)

	response = requests.get(resource)
	if response.status_code != 200:
		raise WebfingerError("HTTP error {code} retrieving {url}".format(code=response.status_code, url=resource))

	return parse_diaspora_webfinger(response.content)