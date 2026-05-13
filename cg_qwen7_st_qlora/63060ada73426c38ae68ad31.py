def _convert_non_cli_args(self, parser_name, values_dict):
	"""
	Casts arguments to correct types by modifying values_dict param.

By default all the values are strings.

:param parser_name: The command name, e.g. main, virsh, ospd, etc
:param values_dict: The dict of with arguments
	"""
	for arg in self.parsers[parser_name].get_arguments():
		if not isinstance(arg.type, str) or arg.type == 'str':
			continue

		try:
			values_dict[arg.name] = arg.type(values_dict.get(arg.name))
		except ValueError as ex:
			raise CommandError('Invalid value for argument %s: %s' %
			                   (arg.name, ex))