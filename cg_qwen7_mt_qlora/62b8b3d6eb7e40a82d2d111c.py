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
			output.append(arg)
		elif isinstance(arg, tuple) and len(arg) == 2:
			output.extend(_normalizeargs(arg))
		else:
			output.append(Interface(arg))

	return output