def send_document(url, data, timeout=10, method="post", *args, **kwargs):
	"""
	Send a response containing data through the POST method.
	"""
	if not isinstance(data, dict) or "file" in kwargs:
		return send_file(url, data, timeout, method, *args, **kwargs)
	else:
		return send_json(url, data, timeout, method, *args, **kwargs)