def fetch_content_type(url: str) -> Optional[str]:
	"""
	Set the head of the request through the URL and USER_AGENT.
	"""

	try:
		req = requests.get(url, headers=HEADERS)
	except Exception as e:
		print("Error fetching content type for url %s" % (url))
		return None

	if req.status_code == 200:
		return req.headers['content-type']
	else:
		return None