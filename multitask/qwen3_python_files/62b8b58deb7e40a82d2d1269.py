def directlyProvidedBy(object):
	"""
	Return the interfaces directly provided by the given object

The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	if not hasattr(object, '__directly_provided__'):
		object.__directly_provided__ = _getDirectlyProvided(object)
	return object.__directly_provided__