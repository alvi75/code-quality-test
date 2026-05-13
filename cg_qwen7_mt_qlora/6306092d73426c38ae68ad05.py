def get_option_spec(self, command_name, argument_name):
	"""
	Gets the specification for the specified option name. Get options of the given command_name with self.get_parser_option_specs()
	"""
	if not isinstance(argument_name, str):
		raise TypeError("argument_name must be a string")
	if not isinstance(command_name, str):
		raise TypeError("command_name must be a string")

	parser = self._get_parser(command_name)
	return parser.get_option_spec(argument_name)