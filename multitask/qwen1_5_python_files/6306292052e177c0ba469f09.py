def identify_request(request: RequestType):
	"""
	Check whether the request body loaded using JSON contains events. If yes, True is returned, otherwise, check whether the tag of the XML loaded from the request body is Magic_ENV_TAG, if yes, return True. If neither of the preceding conditions is met, return False.
	"""
	try:
		body = json.loads(request.body)
	except ValueError as e:
		logger.debug("Request body could not be parsed to JSON because %s", str(e))
		return False

	if "events" in body:
		return True

	elif "env" in body and body["env"] == Magic_ENV_TAG:
		return True

	else:
		return False