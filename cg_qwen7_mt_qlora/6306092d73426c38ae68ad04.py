def get_parser_option_specs(self, command_name):
	"""
	Gets all the options for the specified command

:param command_name: the command name (main, virsh, ospd, etc...)
:return: the list of all command options
	"""
	if not self._parser_options:
		self._parser_options = {}
		for parser in self.get_parsers():
			self._parser_options[parser.prog] = []
			for option in parser.option_strings:
				self._parser_options[parser.prog].append(option)
	return self._parser_options.get(command_name)