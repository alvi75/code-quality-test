def retrieve_diaspora_host_meta(host):
	"""
	Retrieve a remote Diaspora host-meta document.

:arg host: Host to retrieve from
:returns: ``XRD`` instance
	"""
	from . import XRD
	import requests

	url = 'http://www.diaspora.org/hosts/%s' % (host)
	response = requests.get(url)

	if response.status_code == 200:
		return XRD.from_xml(response.content)