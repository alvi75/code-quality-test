def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""

	if not isInterface(iface):
		raise TypeError("First argument must be a valid interface.")

	if not isinstance(candidate, type):
		return False

	for name in iface.__implements__:
		if not _verifyObject(name, candidate, tentative=tentative):
			return False

	return True