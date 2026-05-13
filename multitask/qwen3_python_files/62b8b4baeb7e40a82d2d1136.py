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
		pass
	else:
		raise Invalid(
			"{!r} does not implement {!r}".format(candidate, iface),
			candidate=candidate,
			iface=iface,
		)
	for method in iface.methods:
		if hasattr(candidate, method.__name__):
			continue
		if vtype is None:
			raise Invalid(
				"{!r} does not define {!r}".format(candidate, method),
				candidate=candidate,
				iface=iface,
			)
		elif vtype is AnyType:
			pass
		elif vtype is Any:
			pass
		elif vtype is AnyStr:
			pass
		elif vtype is AnyNumber:
			pass
		elif vtype is AnyCallable:
			pass
		elif vtype is AnyUnion:
			pass
		elif vtype is AnyTuple:
			pass
		elif vtype is AnyList:
			pass
		elif vtype is AnyDict:
			pass
		elif vtype is AnySet:
			pass
		elif vtype is AnyBytes:
			pass
		elif vtype is AnyString:
			pass
		elif vtype is AnyInt:
			pass