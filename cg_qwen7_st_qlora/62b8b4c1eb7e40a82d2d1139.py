def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""

	if not isinstance(candidate, type):
		raise TypeError("Expected a class, got %r" % (candidate,))
	return iface.providedBy(candidate) or (
		not tentative and iface.isImplementedBy(candidate))