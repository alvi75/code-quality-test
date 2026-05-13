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
			raise Invalid("Does not implement %s" % iface.__name__)
	if isinstance(candidate, type) and hasattr(candidate, '__implementers__'):
		for impl in candidate.__implementers__:
			try:
				_verify(iface, impl)
			except Invalid as e:
				e = 'While implementing %s.%s' % (
					candidate.__name__, getattr(e, 'attribute', '<init>'))
				if hasattr(e, 'cause'):
					e.cause.insert(0, e)
					e = e.cause[0]
				raise Invalid(e)
	return True
	def get_callable_attr(c, attr_name):
		a = c.__dict__.get(attr_name)
		if callable(a):
			return a
		else:
			return lambda x:x
	def check_signature(method, arg_names, allowed_kwarg_keys):
		if method == "__init__":
			signature = inspect.signature(getattr(candidate, "__init__"))
			posargs = list(signature.parameters.keys())[:-2] # self, init
			varargs = None
			varkw = False
		elif method == "__new__":
			signature = inspect.signature(getattr(candidate, "__new__