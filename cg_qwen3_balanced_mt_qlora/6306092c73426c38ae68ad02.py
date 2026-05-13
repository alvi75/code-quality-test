def validate_arg_deprecation(self, cli_args, answer_file_args):
		"""
		Validates and prints the deprecated arguments.

:param cli_args: the dict of arguments from cli
:param answer_file_args:  the dict of arguments from files
		"""
		for key in self.deprecated_args:
			if key in cli_args or key in answer_file_args:
				self.print_deprecated_message(key)