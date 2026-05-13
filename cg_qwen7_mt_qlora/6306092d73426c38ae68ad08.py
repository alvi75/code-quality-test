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

	required = []
	for arg in self._argspec:
		if not isinstance(arg, Argument) or not hasattr(arg, 'required_when'):
			continue

		arg_name = arg.name
		arg_value = args.get(arg_name)
		if arg.required_when is None:
			continue

		if not isinstance(arg.required_when, (list, tuple)):
			arg.required_when = [arg.required_when]

		for required_arg in arg.required_when:
			if required_arg in args and args[required_arg] == arg_value:
				required.append(arg_name)

	return required