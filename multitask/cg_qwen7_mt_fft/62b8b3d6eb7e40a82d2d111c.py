def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments

Normalization arguments might contain Declarions, tuples, or single
interfaces.

Anything but individial interfaces or implements specs will be expanded.
	"""

	if not isinstance(sequence, (tuple, list)):
		sequence = [sequence]

	for item in sequence:
		if issubclass(item, Declaration):
			yield item
		elif hasattr(item, '__iter__'):
			for subitem in _normalizeargs(item):
				yield subitem
		else:
			yield Interface(item)