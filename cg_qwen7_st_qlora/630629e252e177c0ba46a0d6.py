def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.

:arg host: Host to retrieve from
:returns: ``XRD`` instance

	"""

	host = host.strip()
	if not host.startswith('http'):
		host = 'https://' + host

	try:
		r = requests.get(host, timeout=5)
	except Exception as e:
		raise ConnectionError(e)

	if r.status_code != 200:
		raise ConnectionError("HTTP status %s" % (r.status_code))

	return XRD(r.content)