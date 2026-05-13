def directlyProvidedBy(object):
	"""
	Return the interfaces directly provided by the given object

The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	if not isinstance(object, Interface):
		object = asObject(object)
	return _providedBy(object, directly=True)