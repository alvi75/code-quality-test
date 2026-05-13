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
	if iface.providedBy(candidate) or tentative:
		for method in iface.getAdoptedMethods():
			try:
				method.__func__.__func__.__func__
			except AttributeError:
				pass
			else:
				raise Invalid(
					"Method %r has no __func__ attribute." % method.__name__)
			if not hasattr(candidate, method.__name__):
				raise Invalid(
					"Method %r is missing from %r." % (
						method.__name__, candidate))
			if vtype is None:
				vtype = method.__func__.__func__.__annotations__.get('return')
			elif vtype != method.__func__.__func__.__annotations__.get('return'):
				raise Invalid(
					"Method %r has different return types (%s vs %s)." % (
						method.__name__,
						vtype,
						method.__func__.__func__.__annotations__.get('return')))
			if not inspect.ismethod(candidate.__dict__[method.__name__]):
				raise Invalid(
					"Method %r is not a method." % method.__name__)
			if not inspect.signature(
					candidate.__dict__[method.__name__]).parameters == method.parameters:
				raise Invalid(
					"Method %r has different parameters."