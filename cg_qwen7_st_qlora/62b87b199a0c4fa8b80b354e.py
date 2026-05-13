def is_fill_request_seq(seq):
	"""
	Check whether seq can be converted to FillRequestSeq and bool is returned.
	"""
	try:
		FillRequestSeq(seq)
	except ValueError:
		return False
	else:
		return True