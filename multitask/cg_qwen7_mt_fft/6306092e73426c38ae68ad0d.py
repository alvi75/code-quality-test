def create_complex_argumet_type(self, subcommand, type_name, option_name,
								   spec_option):
	"""
	Returns the corresponding function in COMPLEX_TYPES based on type_name and returns the result obtained by complex_action after option_name,(self.vars, self.defaults, self.plugin_path), subcommand, spec_option) is input.
	"""

	if not hasattr(COMPLEX_ARGS, type_name):
		raise Exception("No such complex argument %s" % (type_name))
	return getattr(COMPLEX_ARGS, type_name)(option_name, spec_option, self, subcommand)