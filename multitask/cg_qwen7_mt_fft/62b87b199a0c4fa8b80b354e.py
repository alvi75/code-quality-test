def is_fill_request_seq(seq):
	"""
	Check whether seq can be converted to FillRequestSeq and bool is returned.
	"""
	try:
		FillRequestSeq(seq)
	except (TypeError, ValueError):
		return False

	return True