def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Returns a formatted dictionary, including information such as url and document_path.
	"""

	if not document_path:
		document_path = "/nodeinfo/2.0.json"

	nodeinfo_url = url + document_path

	try:
		r = requests.get(nodeinfo_url)
	except Exception as e:
		raise NodeInfoError("Unable to fetch node info from %s: %s" % (url, str(e)))

	if r.status_code != 200:
		raise NodeInfoError("Node info request returned status code %d for %s" % (r.status_code, nodeinfo_url))

	return {
		"url": nodeinfo_url,
		"document_path": document_path,
		"document": r.json()
	}