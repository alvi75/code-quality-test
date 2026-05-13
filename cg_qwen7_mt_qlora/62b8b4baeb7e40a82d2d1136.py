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
				"{} does not claim to implement {}".format(candidate, iface))

	methods = set()
	for name, method in iface.classImplements.__dict__.items():
		if name.startswith('_'):
			continue
		if not callable(method):
			continue
		methods.add(name)
		sig = inspect.signature(method)
		try:
			candidate_method = getattr(candidate, name)
		except AttributeError:
			raise Invalid("{} does not define {}"
						  .format(candidate, name))
		else:
			if not callable(candidate_method):
				raise Invalid("{} does not define {} as a function"
							  .format(candidate, name))
			candidate_sig = inspect.signature(candidate_method)
			if sig != candidate_sig:
				raise Invalid("Signature mismatch for {}.{}:"
							  "\n\tExpected {}\n\tGot {}"
							  .format(candidate, name, sig, candidate_sig))

	attributes = set()
	for name, attribute in iface.classProvides.__dict__.items():
		if name.startswith('_'):
			continue
		if not isinstance(attribute, Attribute):
			continue
		attributes.add(name)
		try:
			getattr(candidate, name)
		except AttributeError:
			raise Invalid("{}