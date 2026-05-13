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
		raise Invalid(
			"%s does not implement %s"
			% (
				candidate.__class__.__name__,
				iface.__class__.__name__
			)
		)

	method_errors = []
	for method_name, method in iface._methods.items():
		try:
			verifyMethod(method_name, getattr(candidate, method_name))
		except Exception as e:
			method_errors.append(e)

	attr_errors = []
	for attr_name, attr in iface._attributes.items():
		try:
			getattr(candidate, attr_name)
		except AttributeError as e:
			attr_errors.append(e)

	if method_errors + attr_errors == []:
		return True

	error_messages = []

	if method_errors != []:
		error_messages.append(
			"Methods:\n%s" %
			"\n".join(str(error) for error in method_errors)
		)

	if attr_errors != []:
		error_messages.append(
			"Attributes:\n%s" %
			"\n".join(str(error) for error in attr_errors)
		)

	raise Invalid("\n\n".join(error_messages))