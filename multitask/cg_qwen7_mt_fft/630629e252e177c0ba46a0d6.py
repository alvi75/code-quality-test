def retrieve_diaspora_host_meta(host):
    """
	Retrieve a remote Diaspora host-meta document.

:arg host: Host to retrieve from
:returns: ``XRD`` instance

	"""
	try:
		response = requests.get(
			"http://{host}/.well-known/host-meta".format(host=host),
			headers={"Accept": "application/xrd+xml"},
			timeout=3,
		)
		return XRD.parse_xrd(response.content, response.url)
	except (requests.RequestException, etree.XMLSyntaxError):
		return None