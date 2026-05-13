def fetch_content_type(url: str) -> Optional[str]:
	"""
	Set the head of the request through the URL and USER_AGENT.
	"""
	req = requests.head(url, headers={'User-Agent': USER_AGENT})
	return req.headers.get('content-type')