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

	if not tentative:
		if not iface.providedBy(candidate):
			raise Invalid(
				"{} does not claim to implement {}".format(candidate, iface)
			)

	methods = set()
	for name, method in iface._v_methods.items():
		try:
			candidate_method = getattr(candidate, name)
		except AttributeError as e:
			raise Invalid("Missing attribute {!r} for {}".format(name, iface)) from e
		else:
			methods.add((name, method))
			if not inspect.ismethod(candidate_method) \
					and not isinstance(candidate_method, MethodType):
				raise Invalid(
					"Attribute {!r} must be callable for {}".format(name, iface)
				)
			elif not inspect.isfunction(candidate_method) \
					and not isinstance(candidate_method, FunctionType):
				raise Invalid(
					"Attribute {!r} must be a function for {}".format(name, iface)
				)
			elif not inspect.isclass(candidate_method.__self__):
				continue
			elif not issubclass(candidate_method.__self__, type(candidate)):
				raise Invalid(
					"Attribute {!r} must belong to {} for {}".format(
						name, candidate, iface
					)
				)
			elif not method.check(candidate