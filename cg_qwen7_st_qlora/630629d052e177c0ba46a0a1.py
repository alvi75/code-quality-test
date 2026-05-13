def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
author did actually generate this message.
	"""

	if not public_key:
		raise ValueError("Public key is required for verification")

	try:
		sig = doc.getElementsByTagNameNS(XMLSEC_NS, "Signature")[0]
	except IndexError:
		return False

	# Verify the signature against the public key
	result = libxml2mod.xmlSecDSigCtxVerify(sig._o, public_key)
	if result != 1:
		return False

	# Check if the signature was made with a trusted certificate
	cert = libxml2mod.xmlSecX509CrtLoad(signature.keyInfoCertFile,
											libxml2mod.XML_C14N_METHOD_NONE)

	if cert is None or not cert.isTrusted():
		return False

	return True