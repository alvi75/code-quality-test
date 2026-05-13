def try_retrieve_webfinger_document(handle: str) -> Optional[str]:
	"""
	Try to retrieve an RFC7033 webfinger document. Does not raise if it fails.
	"""
	try:
		return retrieve_webfinger_document(handle)
	except Exception as e:
		logger.exception(e)
		return None