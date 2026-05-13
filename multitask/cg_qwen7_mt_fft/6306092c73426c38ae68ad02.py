def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.

:param cli_args: the dict of arguments from cli
:param answer_file_args:  the dict of arguments from files
	"""
	if self.args_mapping:
			for old_key in self.args_mapping.keys():
				new_key = self.args_mapping[old_key]
				if new_key not in cli_args and old_key in cli_args:
					self._deprecated_option(old_key, new_key)

	if self.file_args_mapping:
			for old_key in self.file_args_mapping.keys():
				new_key = self.file_args_mapping[old_key]
				if new_key not in answer_file_args and old_key in answer_file_args:
					self._deprecated_option(old_key, new_key)