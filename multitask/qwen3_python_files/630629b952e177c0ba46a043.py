def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Returns a formatted dictionary, including information such as url and document_path.
	"""
	if not document_path:
		document_path = '/.well-known/nodeinfo'
	nodeinfo_url = urlparse.urljoin(url, document_path)
	response = requests.get(nodeinfo_url)
	if response.status_code == 200:
		return json.loads(response.content)
	else:
		raise Exception('Error getting nodeinfo from %s' % nodeinfo_url)