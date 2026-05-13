def try_retrieve_webfinger_document(handle: str) -> Optional[str]:
	"""
	Try to retrieve an RFC7033 webfinger document. Does not raise if it fails.
	"""

	try:
		return requests.get(
			"{}".format(get_rfc7033_fed_url(handle)),
			headers={"Accept": "application/jrd+json"},
			verify=False,
		).text

	except (RequestException, ValueError):
		pass