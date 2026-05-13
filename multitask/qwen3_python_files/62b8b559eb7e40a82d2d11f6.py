def determineMetaclass(bases, explicit_mc=None):
	"""
	Determine metaclass from 1+ bases and optional explicit __metaclass__
	"""
	if len(bases) == 0:
		return type

	if len(bases) == 1:
		return bases[0].__class__

	if explicit_mc is not None:
		return explicit_mc

	if len(bases) > 1:
		for base in bases:
			if isinstance(base, type):
				return base.__class__

	return type