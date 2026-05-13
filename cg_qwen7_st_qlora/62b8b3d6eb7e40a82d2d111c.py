def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments

Normalization arguments might contain Declarions, tuples, or single
interfaces.

Anything but individial interfaces or implements specs will be expanded.
	"""

	if not sequence:
		return []

	output = output or []
	for arg in sequence:
		if isinstance(arg, Declaration):
			arg = arg.declaration
		elif isinstance(arg, tuple):
			arg = _normalizeargs(arg)
		else:
			arg = [arg]
		output.extend(arg)

	return output