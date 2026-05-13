def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
author did actually generate this message.
	"""
	try:
		# Verify the signature
		cert = crypto.load_certificate(crypto.FILETYPE_PEM, public_key)
		cert.verify(doc, signature)
	except Exception as e:
		raise VerificationError("Signature verification failed: %s" % str(e))
	return True