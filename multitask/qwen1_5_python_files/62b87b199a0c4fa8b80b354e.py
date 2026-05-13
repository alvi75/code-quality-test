def is_fill_request_seq(seq):
	"""
	Check whether seq can be converted to FillRequestSeq and bool is returned.
	"""
	try:
		return isinstance(seq, FillRequestSeq)
	except TypeError:
		pass

	try:
		seq = list(seq)
	except TypeError:
		return False

	if len(seq) != 2:
		return False

	try:
		return all([isinstance(x, FillRequest) for x in seq])
	except TypeError:
		return False