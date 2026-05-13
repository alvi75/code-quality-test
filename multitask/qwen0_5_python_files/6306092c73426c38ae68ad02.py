def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.

:param cli_args: the dict of arguments from cli
:param answer_file_args:  the dict of arguments from files
	"""
	if not self.deprecated:
		return

	# Validate that all deprecated options have been removed.
	for arg in self.deprecated:
		if arg in cli_args or arg in answer_file_args:
			continue
		else:
			self.logger.error("Option %s is no longer supported", arg)
			sys.exit(1)