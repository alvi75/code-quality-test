def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
author did actually generate this message.
	"""

	if not public_key:
		return False

	try:
		signature = base64.b64decode(signature)
	except TypeError as e:
		raise ValueError("Invalid signature: %s" % str(e))

	sig_method = doc.find(".//dsig:SignatureMethod", NSMAP)
	sig_alg = sig_method.get("{http://www.w3.org/2001/XMLSchema-instance}type")
	sig_alg = sig_alg.split(":")[-1]

	sig_value = doc.find(".//dsig:SignatureValue", NSMAP).text
	sig_value = base64.b64decode(sig_value)

	signed_info = doc.find(".//dsig:SignedInfo", NSMAP)
	canonicalized_signed_info = canonicalize(signed_info)

	digest = hashlib.sha1(canonicalized_signed_info).digest()

	public_key = crypto.load_publickey(crypto.FILETYPE_PEM, public_key)
	crypto.verify(public_key, sig_value, digest, sig_alg)