def identify_request(request: RequestType):
	"""
	Check whether the request body loaded using JSON contains events. If yes, True is returned, otherwise, check whether the tag of the XML loaded from the request body is Magic_ENV_TAG, if yes, return True. If neither of the preceding conditions is met, return False.
	"""

	if isinstance(request.body, str) or isinstance(request.body, bytes):
		try:
			request_json = json.loads(request.body)
			return 'events' in request_json
		except ValueError as e:
			pass

		try:
			root_tag = etree.fromstring(request.body).tag
			return root_tag == Magic_ENV_TAG
		except Exception as e:
			pass

	return False