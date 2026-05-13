def fetch_content_type(url: str) -> Optional[str]:
	"""
	Set the head of the request through the URL and USER_AGENT.
	"""
	try:
		response = requests.head(url, headers={'User-Agent': 'Mozilla/5.0'})
	except (requests.RequestException, requests.Timeout):
		return None

	if response.ok:
		return response.headers.get('content-type', '')