def get_parser_option_specs(self, command_name):
		"""Gets all the options for the specified command

:param command_name: the command name (main, virsh, ospd, etc...)
:return: the list of all command options
		"""
		options = self._commands[command_name].options
		return [option.spec for option in options]