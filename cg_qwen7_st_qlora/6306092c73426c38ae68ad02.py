def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.

:param cli_args: the dict of arguments from cli
:param answer_file_args:  the dict of arguments from files
	"""

	if 'output' in cli_args:
		self.logger.warning('The argument "output" is deprecated. Use "report" instead.')
	elif 'report' not in cli_args:
		cli_args['report'] = 'json'

	if 'report_format' in cli_args:
		self.logger.warning('The argument "report_format" is deprecated. Use "report" instead.')

	if 'report_path' in cli_args:
		self.logger.warning('The argument "report_path" is deprecated. Use "report" instead.')