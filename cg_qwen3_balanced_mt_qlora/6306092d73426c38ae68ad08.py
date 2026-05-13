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
	required_args = []
	for option in options_spec:
		if 'required_when' in option:
			for required_when in option['required_when']:
				if required_when[0] in args and args[required_when[0]] == required_when[1]:
					required_args.append(option['name'])
	return required_args