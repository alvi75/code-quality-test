def determineMetaclass(bases, explicit_mc=None):
	"""
	Determine metaclass from 1+ bases and optional explicit __metaclass__
	"""
	if not isinstance(bases, (list, tuple)):
		bases = [bases]
	if len(bases) == 0:
		raise ValueError("No base classes specified")
	if len(bases) > 1:
		raise ValueError("More than one base class specified")

	if explicit_mc is None:
		# Try to find a metaclass in the base classes.
		for base in bases:
			try:
				return base.__metaclass__
			except AttributeError:
				pass

		# If we get here, then no metaclass was found.
		raise ValueError("No metaclass found for any of %s" % bases)

	else:
		# We have only one base class, so use it directly.
		return bases[0].__metaclass__