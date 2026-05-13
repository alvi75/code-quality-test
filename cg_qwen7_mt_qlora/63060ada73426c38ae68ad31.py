def _convert_non_cli_args(self, parser_name, values_dict):
	"""
	Casts arguments to correct types by modifying values_dict param.

By default all the values are strings.

:param parser_name: The command name, e.g. main, virsh, ospd, etc
:param values_dict: The dict of with arguments
	"""
	for arg in self._arg_types[parser_name]:
		if arg not in values_dict:
			continue

		values_dict[arg] = self._arg_types[parser_name][arg](values_dict[arg])