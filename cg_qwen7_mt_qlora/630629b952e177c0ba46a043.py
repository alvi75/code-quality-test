def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Returns a formatted dictionary, including information such as url and document_path.
	"""

	if not document_path:
		document_path = '/nodeinfo/2.0/'

	nodeinfo_url = urljoin(url, document_path)

	try:
		response = requests.get(nodeinfo_url)
	except Exception as e:
		return None

	if response.status_code != 200:
		return None

	data = json.loads(response.text)

	data['url'] = nodeinfo_url
	data['document_path'] = document_path

	return data