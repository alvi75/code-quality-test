def identify_request(request: RequestType) -> bool:
	"""
	Check whether the request body loaded using JSON contains events. If yes, True is returned. Otherwise, False is returned.
	"""

	if not isinstance(request, (str, bytes)):
		return False

	try:
		data = json.loads(decode_if_bytes(request))
	except ValueError:
		return False

	return 'notification' in data or 'event' == next(iter(data))