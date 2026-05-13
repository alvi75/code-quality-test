def get_parser_option_specs(self, command_name):
	"""
	Gets all the options for the specified command

:param command_name: the command name (main, virsh, ospd, etc...)
:return: the list of all command options
	"""
	options = []
	for option in self._parser.option_list:
		if option.dest == 'commands':
			continue
		if not hasattr(option, 'metavar'):
			option.metavar = option.dest.upper()
		if not hasattr(option, 'help'):
			option.help = "No help available"
		if hasattr(option, 'default') and \
				(option.default is None or option.default == []):
			option.default = ''
		if hasattr(option, 'choices'):
			if len(option.choices) > 10:
				option.talks_to_choices = True
			else:
				for choice in option.choices:
					if isinstance(choice, str):
						pass
					elif isinstance(choice, Command):
						pass
					else:
						raise ValueError("Choices must be a string or a Command instance")
		options.append((option.dest, option))
	return options