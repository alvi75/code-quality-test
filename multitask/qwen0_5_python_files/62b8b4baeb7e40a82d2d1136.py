def _verify(iface, candidate, tentative=False, vtype=None):
	"""
	Verify that *candidate* might correctly provide *iface*.

This involves:

- Making sure the candidate claims that it provides the
  interface using ``iface.providedBy`` (unless *tentative* is `True`,
  in which case this step is skipped). This means that the candidate's class
  declares that it `implements <zope.interface.implementer>` the interface,
  or the candidate itself declares that it `provides <zope.interface.provider>`
  the interface

- Making sure the candidate defines all the necessary methods

- Making sure the methods have the correct signature (to the
  extent possible)

- Making sure the candidate defines all the necessary attributes

:return bool: Returns a true value if everything that could be
   checked passed.
:raises zope.interface.Invalid: If any of the previous
   conditions does not hold.

.. versionchanged:: 5.0
    If multiple methods or attributes are invalid, all such errors
    are collected and reported. Previously, only the first error was reported.
    As a special case, if only one such error is present, it is raised
    alone, like before.
	"""

	if iface.providedBy(candidate):
		return True

	if tentative:
		return False

	# Verify that the candidate implements the interface
	try:
		candidate.provides( iface )
	except InterfaceError as e:
		raise Invalid("Interface '%s' has no implementation for "
			"interface '%s'.\n%s" % (iface.__name__, candidate.__name__, str(e)))

	# Verify that the candidate provides all the methods
	for method in candidate.methods():
		if method.name() == 'provide':
			continue

		try:
			method.providedBy(candidate)
		except InterfaceError as e:
			raise Invalid("Method '%s' of class '%s' is not provided by "
				"%s.\n%s" % (method.name(), candidate.__name__, method.__name__, str(e)))
		else:
			continue

		# Verify that the method has the right number of arguments
		if len(method.args) != 1:
			raise Invalid("Method '%s' of class '%s' has too many arguments."
				"\n%s" % (method.name(), candidate.__name__, str(e)))

		# Verify that the method has the right return type
		if method.returnType() is None