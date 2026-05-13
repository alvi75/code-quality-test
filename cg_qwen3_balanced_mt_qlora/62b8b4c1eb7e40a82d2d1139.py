def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	if not isinstance(iface, Interface):
		raise TypeError("Expected an interface class, got %r" % iface)
	if not isinstance(candidate, type):
		raise TypeError("Expected a class, got %r" % candidate)

	# If we're in a tentative mode, we don't want to raise any exceptions,
	# just return False if there's no match.
	try:
		return iface.providedBy(candidate)
	except InterfaceError:
		if tentative:
			return False
		else:
			raise