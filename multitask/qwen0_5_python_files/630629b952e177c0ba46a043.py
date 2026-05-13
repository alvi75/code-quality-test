def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Returns a formatted dictionary, including information such as url and document_path.
	"""
	url = urlparse.urlparse(url)
	if not document_path:
		document_path = os.path.join(os.getcwd(), 'nodeinfo.json')
	return {
		'url': url,
		'document_path': document_path,
	}