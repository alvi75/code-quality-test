def send_document(url, data, timeout=10, method="post", *args, **kwargs):
	"""
	Send a response containing data through the POST method.
	"""

	if not isinstance(data, bytes) or len(data) > 2**31:
		raise ValueError("Data must be a byte string of length <= 2^31")

	return send_file(
		url,
		data=data,
		timeout=timeout,
		method=method,
		*args,
		**kwargs
	)