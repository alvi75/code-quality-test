def try_retrieve_webfinger_document(handle: str) -> Optional[str]:
	"""
	Try to retrieve an RFC7033 webfinger document. Does not raise if it fails.
	"""

	try:
		return requests.get(
			f'https://{handle}.well-known/webfinger',
			params={'resource': f'acct:{handle}'},
			timeout=1,
			headers={
				'Accept': 'application/jrd+json'
			}
		).text

	except Exception as e:
		logger.debug('Failed to retrieve webfinger document for %s', handle, exc_info=e)
		return None