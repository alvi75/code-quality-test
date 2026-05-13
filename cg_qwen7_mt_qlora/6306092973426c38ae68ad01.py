def get_deprecated_args(self):
	"""
	Returning dict with options which deprecate others. options from self.spec_helper.iterate_option_specs()
	"""
	return {opt.name: opt.deprecated for opt in self.spec_helper.iterate_option_specs() if opt.deprecated}