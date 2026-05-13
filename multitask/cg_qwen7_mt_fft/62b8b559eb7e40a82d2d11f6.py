def determineMetaclass(bases, explicit_mc=None):
	"""
	Determine metaclass from 1+ bases and optional explicit __metaclass__
	"""
	if explicit_mc is not None:
		metaclass = explicit_mc
	else:
		metaclass = type

	for base in bases:
			if hasattr(base,"__metaclass__"):
				metaclass = base.__metaclass__

	return metaclass