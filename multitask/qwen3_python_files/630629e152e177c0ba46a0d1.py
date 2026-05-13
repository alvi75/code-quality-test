def try_retrieve_webfinger_document(handle: str) -> Optional[str]:
	"""
	definition of a webfinger document is in https://tools.ietf.org/html/rfc7033

	:param handle: The handle (e.g. ``acct:alice``)
	:return: The webfinger document, or None if it could not be retrieved
	"""
	try:
		response = requests.get(
			f"https://{handle.split(':')[1]}/.well-known/webfinger?rel=authentication"
			"&resource=acct:{handle}"
		)
		if response.status_code == 200:
			return response.text
	except Exception as e:
		pass
	return None