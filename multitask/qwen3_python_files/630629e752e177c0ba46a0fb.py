def send_document(url, data, timeout=10, method="post", *args, **kwargs):
	"""
	Send a response containing data through the POST method.
	"""
	if not isinstance(data, (str, bytes)):
		data = json.dumps(data)
	response = requests.request(method, url, data=data, timeout=timeout, *args, **kwargs)
	return response