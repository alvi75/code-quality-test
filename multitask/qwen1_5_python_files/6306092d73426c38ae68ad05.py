def get_option_spec(self, command_name, argument_name):
		"""
		Gets the specification for the specified option name. Get options of the given command_name with self.get_parser_option_specs()
		"""
		if not command_name in self._parser.option_registrations:
			raise Exception("Unknown command: %s" % command_name)
		for opt in self._parser.option_registrations[command_name]:
			if opt.dest == argument_name:
				return opt.parser_spec
		raise Exception("No such argument: %s" % argument_name)