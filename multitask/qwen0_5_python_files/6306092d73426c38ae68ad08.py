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
	# TODO: this is a hack to support old style commands that don't have
	#       any option group specified in their docstring.
	#       This should be fixed when we get rid of the old style commands.
	if not options_spec:
		options_spec = [option for option in options_spec if option.group == '']
	args = self._parse_command_line(args)
	conditions = []
	for arg in args:
		arg = arg.strip()
		if not arg or arg.startswith('-'):
			continue
		elif arg.startswith('--'):
			conditions.append(arg[2:])
		else:
			conditions.append(arg)
	return conditions