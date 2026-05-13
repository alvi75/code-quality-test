def identify_request(request: RequestType) -> bool:
	"""
	Check whether the request body loaded using JSON contains events. If yes, True is returned. Otherwise, False is returned.
	"""
	if not isinstance(request, dict):
		return False

	for key in ('events', 'event'):
		if key in request.keys():
			return True

	return False