def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Returns a formatted dictionary, including information such as url and document_path.
	"""
	if not document_path:
		document_path = 'nodeinfo2.json'
	url += '/{0}'.format(document_path)
	response = requests.get(url)

	if response.status_code == 404:
		raise ValueError('No well-known document at {0}'.format(url))

	return response.json()