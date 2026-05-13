def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.

:param cli_args: the dict of arguments from cli
:param answer_file_args:  the dict of arguments from files
	"""
	for arg in self.deprecated_args:
		if arg in cli_args or arg in answer_file_args:
			self.printer("The argument %s is deprecated and will be removed soon." % arg)
			if arg in cli_args:
				del cli_args[arg]
			if arg in answer_file_args:
				del answer_file_args[arg]