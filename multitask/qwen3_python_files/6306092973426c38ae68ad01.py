def get_deprecated_args(self):
	"""
	Returning dict with options which deprecate others. options from self.spec_helper.iterate_option_specs()
	"""
	deprecated = {}
	for spec in self.spec_helper.iterate_option_specs():
		if not isinstance(spec, OptionSpec) or not spec.deprecated:
			continue
		deprecated[spec.name] = spec
	return deprecated