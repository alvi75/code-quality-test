def _get_conditionally_required_args(self, command_name, options_spec,
										  args):
	"""
	definition of ``_get_conditionally_required_args``

:param command_name: the command name.
:param options_spec:  the list of command spec options.
:param args: the received input arguments
:return: list, list of argument names with matched ``required_when``
    condition
	"""
	required_when = []
	for option in options_spec:
		if isinstance(option, dict) and 'required_when' in option:
			if all(arg in args for arg in option['required_when']):
				required_when.append(option['argname'])
	return required_when