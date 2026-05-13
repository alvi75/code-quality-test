def directlyProvidedBy(object):
	"""
	Return the interfaces directly provided by the given object

The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	if not IInterface.providedBy(object):
		raise ValueError("%r is not an interface" % (object,))

	for declaration in getDeclarationProvidersFor(object):
		yield declaration.interface