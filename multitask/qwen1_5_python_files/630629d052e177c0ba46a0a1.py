def verify_relayable_signature(public_key, doc, signature):
	"""
	Verify the signed XML elements to have confidence that the claimed
author did actually generate this message.
	"""
	if not isinstance(doc, ElementTree.ElementTree):
		doc = ElementTree.fromstring(doc)
	signature_elm = doc.find(".//{%s}Signature" % ns_uri("ds"))
	if not signature_elm:
		raise SignatureError("No Signature element found")
	if len(signature_elm) > 1:
		raise SignatureError("Too many Signature elements")

	sig_valid = False

	for sig in signature_elm.iterchildren():
		if sig.tag == "{%s}KeyInfo" % ns_uri("ds"):
			key_info = sig.find(".//{%s}Data" % ns_uri("kxml"))
			if key_info is None:
				raise SignatureError("No Data child under KeyInfo")
			if key_info.text != public_key:
				raise SignatureError(
					"Invalid key info: expected '%s', got '%s'" %
					(public_key, key_info.text))
			else:
				sig_valid = True
				break

	if not sig_valid:
		raise SignatureError("Could not find valid key for signature")