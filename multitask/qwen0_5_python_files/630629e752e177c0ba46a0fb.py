def send_document(url, data, timeout=10, method="post", *args, **kwargs):
	"""
	Send a response containing data through the POST method.
	"""
	response = requests.post(
		url=url,
		data=data,
		timeout=timeout,
		method=method,
		*args,
		**kwargs
	)
	return response