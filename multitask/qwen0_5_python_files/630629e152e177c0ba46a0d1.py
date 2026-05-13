def try_retrieve_webfinger_document(handle: str) -> Optional[str]:
	"""
	Try to retrieve an RFC7033 webfinger document. Does not raise if it fails.
	"""
	try:
		response = requests.get(
			"https://api.github.com/user/links/webfinger/{0}".format(handle),
			headers={"Accept": "application/vnd.github.v3.octocat"}
		)
		if response.status_code == 200:
			return response.text
		else:
			raise Exception("Unexpected status code {0} for URL {1}".format(response.status_code, handle))
	except Exception as e:
		print(e)
		return None