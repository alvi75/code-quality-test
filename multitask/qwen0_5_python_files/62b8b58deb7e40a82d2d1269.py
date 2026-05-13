def directlyProvidedBy(object):
	"""
	Return the interfaces directly provided by the given object

The value returned is an `~zope.interface.interfaces.IDeclaration`.
	"""
	import inspect
	import zope.interface
	import zope.interface.interfaces
	
	# get the class of the object
	clss = type(object)
	
	# get all superclasses
	supers = [ clss.__bases__[0] ] + list ( clss . __bases__ ) + [ None ]
	
	# find the first superclass that has a declaration
	for s in supers:
		if hasattr(s, 'declaration'):
			return s
	
	# if we got here then no direct declarations were found
	return None