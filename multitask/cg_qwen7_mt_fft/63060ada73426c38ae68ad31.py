def _convert_non_cli_args(self, parser_name, values_dict):
	"""
	Casts arguments to correct types by modifying values_dict param.

By default all the values are strings.

:param parser_name: The command name, e.g. main, virsh, ospd, etc
:param values_dict: The dict of with arguments
	"""
	if not self._parsers.has_key(parser_name):
			raise ValueError("Parser %s does not exist!"%(parser_name))

	parser = self._parsers[parser_name]
	args_def = parser.args

	for arg in args_def.keys():
		if (not values_dict.has_key(arg)):
			continue

		arg_type = args_def[arg]['type']
		values_dict[arg] = arg_type(values_dict[arg])