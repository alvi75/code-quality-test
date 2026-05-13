def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.

:arg host: Host to retrieve from
:returns: ``XRD`` instance
	"""
	url = "https://%s/.well-known/host-meta" % (host,)
	try:
		response = requests.get(url)
	except Exception as e:
		raise DiasporaHostMetaRetrievalError(str(e))
	if response.status_code != 200:
		raise DiasporaHostMetaRetrievalError("Got back status code %d instead of 200 when retrieving host meta for %s." % (
			response.status_code,
			host,
		))
	return XRD.from_string(response.text)