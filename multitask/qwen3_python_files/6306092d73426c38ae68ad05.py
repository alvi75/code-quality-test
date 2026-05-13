def get_option_spec(self, command_name, argument_name):
	"""
	Gets the specification for the specified option name. Get options of the given command_name with self.get_parser_option_specs()
	"""
	parser = self._parsers[command_name]
	return parser.option_spec[argument_name]