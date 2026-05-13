def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Returns a formatted dictionary, including information such as url and document_path.
	"""

	if not document_path:
		document_path = NODEINFO_WELLKNOWN_PATH

	try:
		response = requests.get( url + document_path )
	except Exception as e:
		print("Error: %s" % (e))
		return None

	if response.status_code == 200:
		return { "url": url, "document": json.loads(response.text) }
	else:
		return None