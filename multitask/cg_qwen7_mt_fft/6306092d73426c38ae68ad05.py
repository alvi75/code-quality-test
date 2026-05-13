def get_option_spec(self, command_name, argument_name):
	"""
	Gets the specification for the specified option name. Get options of the given command_name with self.get_parser_option_specs()
	"""
	if not isinstance(argument_name, str):
		raise TypeError("argument_name must be a string")
	return next((option_spec for option_spec in self.option_specs if option_spec.command == command_name and option_spec.argument == argument_name), None)