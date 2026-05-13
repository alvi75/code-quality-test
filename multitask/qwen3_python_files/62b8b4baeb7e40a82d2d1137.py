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
	if iface.providedBy(candidate) or tentative:
		pass
	else:
		raise Invalid(
			"{} does not implement {}".format(candidate, iface)
		)

	def _verifyMethod(methodName):
		method = getattr(candidate, methodName)
		if not isinstance(method, FunctionType):
			raise Invalid(
				"{}'s method {} must be a function".format(
					candidate, methodName
				)
			)
		if not hasattr(method, "__func__"):
			raise Invalid(
				"{}'s method {} must be a function object".format(
					candidate, methodName
				)
			)
		if not hasattr(method.__func__, "__code__"):
			raise Invalid(
				"{}'s method {} must be a function object with a __code__ "
				"attribute".format(candidate, methodName)
			)
		if not hasattr(method.__func__.__code__, "co_argcount"):
			raise Invalid(
				"{}'s method {} must be a function object with a __code__ "
				"object with a co_argcount attribute".format(
					candidate, methodName
				)
			)
		if not hasattr(method.__func__.__code__, "co_kwonlyargcount"):