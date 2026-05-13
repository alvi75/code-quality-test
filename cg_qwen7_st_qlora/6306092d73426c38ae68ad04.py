def get_parser_option_specs(self, command_name):
	"""
	Gets all the options for the specified command

:param command_name: the command name (main, virsh, ospd, etc...)
:return: the list of all command options
	"""

	if not self._parser:
		return []

	parser = self._parser.get_subcommand_parser(command_name)
	if parser is None:
		raise ValueError("Unknown command %s" % command_name)

	return parser.option_list + parser._option_groups[0].option_list