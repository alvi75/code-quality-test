def get_deprecated_args(self):
	"""
	Returning dict with options which deprecate others. options from self.spec_helper.iterate_option_specs()
	"""
	deprecated = {}
	for option in self.spec_helper.iterate_option_specs():
		if option.deprecated:
			deprecated[option.name] = option

	return deprecated