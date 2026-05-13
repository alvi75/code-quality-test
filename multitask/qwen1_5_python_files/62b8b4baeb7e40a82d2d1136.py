def _verify(iface, candidate, tentative=False, vtype=None):
	"""Verify that *candidate* might correctly provide *iface*.

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
	if not iface:
		return True
	if tentative:
		candidate = IInterface(candidate)
	if not candidate:
		raise Invalid("No implementation for %s" % iface.__name__)
	if not candidate.providedBy(iface):
		raise Invalid("%r does not claim to implement %r" %
			(candidate, iface))
	for attr_name in dir(iface):
		attr = getattr(iface, attr_name)
		try:
			cattr = getattr(candidate, attr_name)
		except AttributeError:
			raise Invalid(
				"%r missing required attribute %r" %
				(candidate, attr_name))
		else:
			if isinstance(attr, Interface) and \
			   isinstance(cattr, Interface):
				sub_iface = cattr
				if tentative:
					sub_iface = IInterface(sub_iface)
				if not _verify(sub_iface, attr, tentative=tentative, vtype=vtype):
					raise Invalid(
						"%r does not define valid %r" %
						(candidate, attr_name))
			elif hasattr(attr, "__call__"):
				if not _verify_method(attr, cattr, vtype=vtype):
					raise Invalid(
						"%r does not define valid %r" %
						(candidate, attr_name))
			elif isinstance