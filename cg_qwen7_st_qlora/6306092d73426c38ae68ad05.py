def get_option_spec(self, command_name, argument_name):
	"""
	Gets the specification for the specified option name. Get options of the given command_name with self.get_parser_option_specs()
	"""
	if not hasattr(self, 'parser'):
		self.parser = argparse.ArgumentParser(description=self.description)
	for parser in self.parsers:
		parser.add_argument(argument_name, help=argument_name)