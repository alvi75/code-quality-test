def get_option_spec(self, command_name, argument_name):
		"""
		Gets the specification for the specified option name. Get options of the given command_name with self.get_parser_option_specs()
		"""
		if not self._option_specs:
			self._option_specs = self.get_parser_option_specs()

		for spec in self._option_specs:
			if spec['command'] == command_name and spec['argument'] == argument_name:
				return spec

		raise ValueError("No such option: %s" % (argument_name))