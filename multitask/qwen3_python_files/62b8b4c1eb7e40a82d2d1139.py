def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	if not issubclass(candidate, ifaces.Iface):
		raise TypeError("candidate must be a subclass of Iface")
	if iface in candidate.implemented:
		return True
	if iface in candidate.required:
		return False
	if tentative:
		return True
	return False