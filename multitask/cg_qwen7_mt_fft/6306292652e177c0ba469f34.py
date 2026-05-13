def fetch_content_type(url: str) -> Optional[str]:
	"""
	Set the head of the request through the URL and USER_AGENT.
	"""
	req = Request(
		url,
		headers={'User-Agent': 'Mozilla/5.0'}
	)
	try:
		response = urlopen(req, timeout=10)
	except (HTTPError, URLError):
		return None

	return response.headers.get('Content-Type')