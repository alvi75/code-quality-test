def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
author did actually generate this message.
	"""
	if not isinstance(doc, ElementTree.Element):
		doc = ElementTree.fromstring(doc)
	return verify_signature(
		public_key,
		doc,
		signature,
		algorithm=RSASSA_PSS,
		hashfunc=hashlib.sha256,
		salt_length=128,
	)