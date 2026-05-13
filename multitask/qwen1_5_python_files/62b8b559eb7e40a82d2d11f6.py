def determineMetaclass(bases, explicit_mc=None):
	"""
	Determine metaclass from 1+ bases and optional explicit __metaclass__
	"""
	if not bases:
		raise TypeError("No mro can be determined for %r" % (type(None),))
	mc = None
	for base in bases:
		try:
			mc = base.__metaclass__
		except AttributeError:
			pass
	else:
		if explicit_mc is not None:
			return explicit_mc
		elif mc is None:
			raise TypeError(
				"The class %s has no metaclass and %s was not specified"
				% (basics.basictype_repr(type(None)), explicit_mc)
			)
	return mc