def _convert_non_cli_args(self, parser_name, values_dict):
	"""
	Casts arguments to correct types by modifying values_dict param.

By default all the values are strings.
:param parser_name: The command name, e.g. main, virsh, ospd, etc
:param values_dict: The dict of with arguments
	"""
	if not self._parser:
	    return

	for arg in self._parser.getnonoptionargs(parser_name):
	    if arg in values_dict:
		value = values_dict[arg]
		try:
		    value = int(value)
		except ValueError:
		    pass
		values_dict[arg] = value