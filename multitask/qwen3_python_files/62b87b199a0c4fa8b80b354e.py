def is_fill_request_seq(seq):
	"""
	Check whether seq can be converted to FillRequestSeq and bool is returned.
	"""
	if not isinstance(seq, Sequence) or len(seq) != 1:
		return False
	if not isinstance(seq[0], FillRequest):
		return False
	return True