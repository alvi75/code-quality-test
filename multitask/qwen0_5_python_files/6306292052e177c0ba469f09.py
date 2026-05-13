def identify_request(request: RequestType):
	"""
	Check whether the request body loaded using JSON contains events. If yes, True is returned, otherwise, check whether the tag of the XML loaded from the request body is Magic_ENV_TAG, if yes, return True. If neither of the preceding conditions is met, return False.
	"""
	if not hasattr(request, 'body'):
		return False

	try:
		request.body = json.loads(request.body)
	except ValueError as e:
		raise InvalidRequestError('Invalid JSON format in request body', e)

	if isinstance(request.body, dict) and 'events' in request.body.keys():
		return True

	elif isinstance(request.body, str) and re.search(r'<\?xml.*?\?>', request.body):
		return True

	elif isinstance(request.body, bytes) and MAGIC_ENV_TAG in request.body.decode('utf-8'):
		return True

	else:
		return False