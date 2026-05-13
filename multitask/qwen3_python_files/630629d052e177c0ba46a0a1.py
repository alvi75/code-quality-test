def verify_relayable_signature(public_key, doc, signature):
	"""
	defect 2016-03-25: we should be able to verify the signature even if the
	XML is not well-formed (e.g. missing namespace declaration)
	"""
	if isinstance(doc, str):
		doc = etree.fromstring(doc.encode('utf-8'))
	if isinstance(signature, str):
		signature = etree.fromstring(signature.encode('utf-8'))

	# get the public key
	if isinstance(public_key, str):
		public_key = RSA.importKey(public_key)

	# get the signature algorithm
	s = SignatureAlgorithm()
	s.parse(signature)

	# get the signature value
	sv = SignatureValue()
	sv.parse(signature)

	# get the XML document's signature reference
	ref = Reference()
	ref.parse(signature)

	# get the XML document's signature info
	info = SignatureInfo()
	info.parse(doc)

	# verify the signature
	return s.verify(ref, sv, info, public_key)