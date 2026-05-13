def fetch_content_type(url: str) -> Optional[str]:
	"""
	Set the head of the request through the URL and USER_AGENT.
	"""
	if not url:
		return None

	response = requests.head(url, headers={'User-Agent': USER_AGENT})
	if response.status_code == 200:
		content_type = response.headers.get('content-type')
		if content_type:
			return parse_content_type(content_type)[0]
	else:
		return None