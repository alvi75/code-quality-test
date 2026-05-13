def _get_seq_with_type(seq, bufsize=None):
	"""
	Return a (sequence, type) pair.
Sequence is derived from *seq*
(or is *seq*, if that is of a sequence type).
	"""
	if isinstance(seq, str):
		return seq.split(), 'str'
	elif isinstance(seq, list):
		return tuple(seq), 'list'
	elif isinstance(seq, set):
		return sorted(list(seq)), 'set'
	elif isinstance(seq, deque):
		return deque(seq), 'deque'
	elif isinstance(seq, dict):
		return dict(seq), 'dict'
	elif isinstance(seq, Counter):
		return Counter(seq), 'Counter'
	elif isinstance(seq, np.ndarray):
		import numpy as np
		return np.array(seq), 'numpy.ndarray'
	elif isinstance(seq, ABCIndexClass):
		return seq, 'ABCIndexClass'
	elif isinstance(seq, ABCSeries):
		return seq.to_frame().values, 'ABCSeries'
	elif isinstance(seq, ABCDataFrame):
		return seq.values, 'ABCDFrame'
	elif isinstance(seq, ABCSeries):
		return seq.values, 'ABCSeries'
	elif isinstance(seq, ABCIndexClass):
		return seq, 'ABCSeries'
	elif isinstance(seq, ABCSeries):
		return seq.values, 'ABCSeries'
	elif isinstance(seq, ABCIndexClass):
		return seq, 'ABCSeries'
	elif isinstance(seq, ABCSeries):
		return seq.values, 'ABCSeries'
	elif isinstance(seq, ABCIndexClass):
		return seq, 'ABCSeries'
	elif isinstance(seq, ABCSeries):
		return seq.values, 'ABCSeries'
	elif isinstance(seq, ABCIndexClass):
		return seq, 'ABCSeries'
	elif isinstance(seq, ABCSeries):
		return seq.values, 'ABCSeries'
	elif isinstance(seq, ABCIndexClass):
		return seq, 'ABCSeries'
	elif isinstance(seq, ABCSeries):
		return seq.values, 'ABCSeries'
	elif isinstance(seq, ABCIndexClass):
		return seq, 'ABCSeries'
	elif isinstance(seq, ABCSeries):
		return seq.values, 'ABCSeries'
	elif isinstance(seq, ABCIndexClass):
		return seq, 'ABCSeries'
	elif isinstance(seq, ABCSeries):
		return seq.values, 'ABCSeries'
	elif isinstance(seq, ABCIndexClass):
		return seq, 'ABCSeries'
	elif isinstance(seq, ABCSeries):
		return seq.values, 'ABCSeries'
	elif isinstance(seq, ABCIndexClass):
		return seq, 'ABCSeries'