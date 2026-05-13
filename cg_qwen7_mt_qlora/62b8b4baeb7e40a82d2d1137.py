def verifyObject(iface, candidate, tentative=False):
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

	if not isinstance(candidate, InterfaceClass):
		raise TypeError("Expected an interface, got %r" % type(candidate))

	if not iface.isImplementedBy(candidate) and not tentative:
		return False

	for name, method in iface._methods.items():
		try:
			candidate_method = getattr(candidate, name)
		except AttributeError:
			return False
		else:
			method.verify(candidate_method)

	for name, attribute in iface._attributes.items():
		try:
			getattr(candidate, name)
		except AttributeError:
			return False

	return True