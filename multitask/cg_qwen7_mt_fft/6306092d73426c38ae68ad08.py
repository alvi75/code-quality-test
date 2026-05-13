def _get_conditionally_required_args(self, command_name, options_spec,
										 args):
	"""
	List arguments with ``required_when`` condition matched.

:param command_name: the command name.
:param options_spec:  the list of command spec options.
:param args: the received input arguments
:return: list, list of argument names with matched ``required_when``
    condition
	"""

	def get_matches(argname):
		return [a for a in args if argname == a or (isinstance(a, Option) and a.name == argname)]

	def is_missing(argname):
		matches = get_matches(argname)
		if matches:
			return False

		arg_defn = options_spec.get(argname)

		if not arg_defn:
			raise ProgrammerError("Argument '%s' was found but has no definition" % argname)

		if 'required_when' not in arg_defn:
			return True

		for when_group in arg_defn['required_when']:
			group_match = all([True if x[1] else bool(get_matches(x[0])) for x in when_group])
			if group_match:
				break
		else:
			return True

		return False

	return [argname for argname in options_spec.keys() if is_missing(argname)]