def _get_seq_with_type(seq, bufsize=None):
	"""
	Return a (sequence, type) pair.
Sequence is derived from *seq*
(or is *seq*, if that is of a sequence type).
	"""
	if isinstance(seq, Sequence):
		return seq, type(seq)
	elif bufsize:
		return list(islice(seq, 0, bufsize)), str
	else:
		raise ValueError("seq must be a Sequence or have a __str__ method")