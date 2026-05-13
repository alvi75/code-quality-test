def get_option_spec(self, command_name, argument_name):
	"""
	Gets the specification for the specified option name. Get options of the given command_name with self.get_parser_option_specs()
	"""
	return self._get_option_spec(command_name, argument_name) if self.has_option(command_name, argument_name) else None