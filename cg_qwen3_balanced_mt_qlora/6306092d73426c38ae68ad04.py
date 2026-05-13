def get_parser_option_specs(self, command_name):
	"""
	Gets all the options for the specified command

:param command_name: the command name (main, virsh, ospd, etc...)
:return: the list of all command options
	"""
	if not self._parser:
		return []

	parser = self._parser[command_name]
	options = []
	for option in parser.option_list:
		options.append({
			'long': option.get_long_opt(),
			'short': option.get_opt_string(),
			'description': option.help,
			'value_type': option.type,
			'required': option.required,
			'positional': option.positional,
			'hidden': option.hidden,
			'choices': option.choices,
			'metavar': option.metavar,
			'conflicts_with': option.conflicts_with,
			'aliases': option.alias,
			'help': option.help,
			'help_format': option.help_format,
			'help_format_args': option.help_format_args,
			'help_format_kwargs': option.help_format_kwargs,
			'help_format_func': option.help_format_func,
			'help_format_func_args': option.help_format_func_args,
			'help_format_func_kwargs': option.help_format_func_kwargs,
			'help_format_func_kwarg_names': option.help_format_func_kwarg_names,
			'help_format_func_kwarg_values': option.help_format_func_kwarg_values,
			'help_format_func_kwarg_defaults': option.help_format_func_kwarg_defaults,
			'help_format_func_kwarg_defaults_values': option.help_format_func_kwarg_defaults_values,
			'help_format_func_kwarg_defaults_values_values': option.help_format_func_kwarg_defaults_values_values,
			'help_format_func_kwarg_defaults_values_values_values': option.help_format_func_kwarg_defaults_values_values_values,
			'help_format_func_kwarg_defaults_values_values_values_values': option.help_format_func_kwarg_defaults_values_values_values_values,
			'help_format_func_kwarg_defaults_values_values_values_values_values': option.help_format_func_kwarg_defaults_values_values_values_values_values,
			'help_format_func_kwarg_defaults_values_values_values_values_values_values': option.help_format_func_kwarg_defaults_values_values_values_values_values_values,
			'help_format_func_kwarg_defaults_values_values_values_values_values_values_values': option.help_format_func_kwarg_defaults_values_values_values_values_values_values_values,
			'help_format_func_kwarg_defaults_values_values