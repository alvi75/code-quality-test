def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.

:arg host: Host to retrieve from
:returns: ``XRD`` instance
	"""
	url = 'http://' + host + '/.well-known/host-meta'
	response = requests.get(url)
	if response.status_code == 200:
		return XRD(response.content)
	else:
		raise Exception('Error retrieving host-meta for %s' % host)