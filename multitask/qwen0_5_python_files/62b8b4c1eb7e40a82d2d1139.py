def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	if iface is None:
		return False

	if not isinstance(candidate, type):
		return False

	if not hasattr(candidate, 'supports'):
		return False

	if not hasattr(candidate.supports, iface):
		return False

	if tentative:
		return True

	return candidate.supports.supportedBy == iface