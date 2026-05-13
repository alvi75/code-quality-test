def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.

:param cli_args: the dict of arguments from cli
:param answer_file_args:  the dict of arguments from files
	"""

	if 'config' in cli_args:
		self.print_warning('The argument --config is deprecated. Use --answer-file instead.')
	elif 'answerfile' in cli_args or 'answerFile' in cli_args:
		self.print_warning('The argument --answerfile/--answerFile is deprecated. Use --answer-file instead.')

	if 'loglevel' in cli_args:
		self.print_warning('The argument --loglevel is deprecated. Use --log-level instead.')