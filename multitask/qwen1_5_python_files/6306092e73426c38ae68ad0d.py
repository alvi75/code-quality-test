def create_complex_argumet_type(self, subcommand, type_name, option_name,
                                     spec_option):
		"""
	Returns the corresponding function in COMPLEX_TYPES based on type_name and returns the result obtained by complex_action after option_name,(self.vars, self.defaults, self.plugin_path), subcommand, spec_option) is input.
		"""
		if type_name == 'choice':
			return self.create_choice_type(subcommand, option_name, spec_option)
		elif type_name == 'flag':
			return self.create_flag_type(subcommand, option_name, spec_option)
		elif type_name == 'file':
			return self.create_file_type(subcommand, option_name, spec_option)
		elif type_name == 'directory':
			return self.create_directory_type(subcommand, option_name, spec_option)
		elif type_name == 'list':
			return self.create_list_type(subcommand, option_name, spec_option)
		elif type_name == 'string':
			return self.create_string_type(subcommand, option_name, spec_option)
		elif type_name == 'type':
			return self.create_type_type(subcommand, option_name, spec_option)
		else:
			raise ValueError('Invalid type name: %s' % type_name)