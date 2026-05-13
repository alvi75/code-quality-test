def validate_arg_deprecated(self, cli_args, answer_file_args):
	""" Validates and prints the deprecated arguments.

:param cli_args: the dict of arguments from cli
:param answer_file_args:  the dict of arguments from files
	"""
	for arg in self.deprecated_arguments:
	    if (arg in cli_args or arg in answer_file_args) and not self.ignore_deprecated:
	        print("DEPRECATED: %s" % arg)
	        if arg in cli_args:
	            del cli_args[arg]
	        elif arg in answer_file_args:
	            del answer_file_args[arg]