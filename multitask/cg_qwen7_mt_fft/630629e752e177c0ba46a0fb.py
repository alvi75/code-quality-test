def send_document(url, data, timeout=10, method="post", *args, **kwargs):
	"""
	Send a response containing data through the POST method.
	"""
	response = requests.request(method, url, data=data,
								headers=get_headers(), timeout=timeout,
								*args, **kwargs)
	return response.text, response.status_code