def determineMetaclass(bases, explicit_mc=None):
	"""
	Determine metaclass from 1+ bases and optional explicit __metaclass__
	"""
	if explicit_mc is not None:
		return explicit_mc

	# Find all metaclasses in bases
	metaclasses = set()
	for base in bases:
		try:
			metaclasses.add(base.__class__)
		except AttributeError:
			pass

	# If there's only one metaclass, use it
	if len(metaclasses) == 1:
		return metaclasses.pop()

	# If there are no metaclasses, use type
	if not metaclasses:
		return type

	# If there are multiple metaclasses, raise error
	raise TypeError("Multiple metaclasses specified")