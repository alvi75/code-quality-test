def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	if not isInterface(iface):
		raise TypeError('%s is not an interface' % iface)
	for attr in dir(candidate):
		if not attr.startswith('_'):
			cAttr = getattr(candidate, attr)
			iAttr = _getAttr(iface, attr)
			if cAttr.__class__ != iAttr.__class__:
				return False
			elif (isinstance(cAttr, Interface) or
					issubclass(cAttr.__class__, iAttr.__class__)) \
			   and not tentative:
				continue
			elif isinstance(cAttr, iAttr.__class__) \
			   and not tentative:
				continue
			else:
				return False
	return True