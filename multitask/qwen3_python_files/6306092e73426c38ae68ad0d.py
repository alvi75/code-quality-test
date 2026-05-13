def create_complex_argumet_type(self, subcommand, type_name, option_name,
                                   spec_option):
	"""
	Returns the corresponding function in COMPLEX_TYPES based on type_name and returns the result obtained by complex_action after option_name,(self.vars, self.defaults, self.plugin_path), subcommand, spec_option) is input.
	"""
	if type_name not in COMPLEX_TYPES:
		raise ValueError("type_name %s not supported" % (type_name))
	return COMPLEX_TYPES[type_name](subcommand, option_name, spec_option)