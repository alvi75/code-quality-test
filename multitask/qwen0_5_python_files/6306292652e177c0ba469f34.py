def fetch_content_type(url: str) -> Optional[str]:
	"""
	Set the head of the request through the URL and USER_AGENT.
	"""
	if not url:
		return None

	url = urlparse.urlparse(url)
	content_type = url.getheaders('Content-Type')[0]
	if content_type.startswith('text/'):
		return 'text'
	elif content_type.startswith('image/'):
		return 'image'
	elif content_type.startswith('application/'):
		return 'application'
	elif content_type.startswith('multipart/'):
		return 'multipart'
	elif content_type.startswith('audio/'):
		return 'audio'
	elif content_type.startswith('video/'):
		return 'video'
	elif content_type.startswith('image/gif'):
		return 'image'
	elif content_type.startswith('image/jpeg'):
		return 'image'
	elif content_type.startswith('image/png'):
		return 'image'
	elif content_type.startswith('image/svg+xml'):
		return 'image'
	elif content_type.startswith('text/html'):
		return 'text'
	elif content_type.startswith('text/xml'):
		return 'text'
	elif content_type.startswith('text/csv'):
		return 'text'
	elif content_type.startswith('text/plain'):
		return 'text'
	elif content_type.startswith('application/x-www-form-urlencoded'):
		return 'application'
	elif content_type.startswith('application/json'):
		return 'application'
	elif content_type.startswith('application/octet-stream'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-opendocument'):
		return 'application'
	elif content_type.startswith('application/vnd.ms-op