def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments

Normalization arguments might contain Declarions, tuples, or single
interfaces.

Anything but individial interfaces or implements specs will be expanded.
	"""
	if output is None:
		output = []
	for arg in sequence:
		if isinstance(arg, tuple):
			arg = arg[0]
		if isinstance(arg, Interface):
			output.append(arg)
		elif isinstance(arg, Implements):
			output.extend(arg.interfaces)
		else:
			raise TypeError("Invalid argument type: %r" % (arg,))
	return output