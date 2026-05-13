def verifyClass(iface, candidate, tentative=False):
	"""
	Verify that the *candidate* might correctly provide *iface*.
	"""
	if not isinstance(candidate, type) or issubclass(candidate, Interface):
		return False

	def _verify(decls):
		for decl in decls:
			try:
				_verify(decl.declarated)
			except RuntimeError as e:
				yield e
			else:
				yield None

	errors = list(_verify(getattr(candidate, "__implementations__", [])))
	if errors:
		return False

	if tentative:
		return True

	try:
		interface = getDeclByName(iface)
		candidate = getDeclByName(candidate)

		assert interface.parent.namespace == candidate.parent.namespace

		mismatched_names = []
		for fn in set(interface.memberNames() + [f.fullname for f in interface.fields]):
			if fn not in candidate.memberNames():
				mismatched_names.append(fn)

		if mismatched_names:
			raise ImplementationError(
				"Interface %s: functions %s were declared but never implemented." %
				(candidate.name,
				 ", ".join(mismatched_names)))

		for fn_name in candidate.memberNames():
			fn = findCandidateFunction(candidate, fn_name)
			if not fn:
				continue

			if not fn.implemented:
				raise ImplementationError("Function %s was declared but never implemented."
					% (fn_name))

			if "default" in fn.attributes:
				del fn.attributes["default"]

		return True
	except Exception as e:
		print(e)
		return False