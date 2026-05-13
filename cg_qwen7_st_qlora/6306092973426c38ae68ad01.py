def get_deprecated_args(self):
	"""
	Returning dict with options which deprecate others. options from self.spec_helper.iterate_option_specs()
	"""
	return {opt_name: opt.deprecates for opt_name, opt in self.spec_helper.iterate_option_specs() if opt.deprecates}