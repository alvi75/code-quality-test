def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
author did actually generate this message.
	"""
	try:
		digest = SHA1.new()
		signature.update(digest)
	except AttributeError:  # pragma: no cover
		import M2Crypto

		digest = M2Crypto.m2.sha1_new()
		signature.update(digest)

	if not public_key.verify(signature.digest(), digest.final()):
		raise SignatureError()