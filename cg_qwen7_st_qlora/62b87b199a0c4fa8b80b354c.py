def _get_seq_with_type(seq, bufsize=None):
	"""
	Return a (sequence, type) pair.
Sequence is derived from *seq*
(or is *seq*, if that is of a sequence type).

	"""
	if isinstance(seq, (str, bytes)):
		return seq, str

	if hasattr(seq, '__iter__'):
		return seq, type(seq)

	if bufsize:
		seq = _readfile(seq, bufsize)
	else:
		seq = open(seq).read()

	return seq, str