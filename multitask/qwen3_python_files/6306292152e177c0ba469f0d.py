def identify_request(request: RequestType) -> bool:
	"""
	Check whether the request body loaded using JSON contains events. If yes, True is returned. Otherwise, False is returned.
	"""
	if isinstance(request, str):
		request = json.loads(request)
	if not isinstance(request, dict):
		return False

	if 'events' in request:
		return True
	elif 'event' in request:
		return True
	else:
		return False