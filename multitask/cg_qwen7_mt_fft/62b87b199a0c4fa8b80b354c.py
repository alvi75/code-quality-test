def _get_seq_with_type(seq, bufsize=None):
	"""
	Return a (sequence, type) pair.
Sequence is derived from *seq*
(or is *seq*, if that is of a sequence type).
	"""
	if isinstance(seq, Sequence):
		return seq, 's'
	elif hasattr(seq, '__array__'):
		seq = np.asarray(seq)
		if not seq.ndim:
			seq = seq.reshape(1)
		return seq, 'a'
	else:
		raise TypeError('Input must be a list or numpy array')