def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments

Normalization arguments might contain Declarions, tuples, or single
interfaces.

Anything but individial interfaces or implements specs will be expanded.
	"""
	if not sequence:
		return []

	if isinstance(sequence[0], Declaration) \
			or isinstance(sequence[0], tuple):
		output = output or []
		for item in sequence:
			if isinstance(item, Declaration):
				item = [item]
			elif isinstance(item, (tuple, list)):
				item = [_expandone(i) for i in item]

			for arg in item:
				if not isinstance(arg, Interface):
					arg = _expandone(arg)
				output.append(arg)

		return output
	else:
		raise TypeError("Declaration argument must be a Declaration, "
						"or a tuple/list of Interfaces")