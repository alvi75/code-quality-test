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
	for arg in self._get_arg_names(options_spec):
		if not self._is_arg_present(arg, args):
			continue

		arg_spec = options_spec[arg]
		if 'required_when' not in arg_spec:
			continue

		condition = arg_spec['required_when']
		if isinstance(condition, str) or not hasattr(condition, '__iter__'):
			condition = [condition]

		for cond in condition:
			if cond == command_name:
				required.append(arg)
				break

	return required