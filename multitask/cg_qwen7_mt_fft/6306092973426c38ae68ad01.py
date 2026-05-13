def get_deprecated_args(self):
		"""
		Returning dict with options which deprecate others. options from self.spec_helper.iterate_option_specs()
		"""
		args = {}
		for name, option in iteritems(self.spec_helper.option_spec):
			if not hasattr(option, 'deprecates'):
				continue

			deprecates_name = option.deprecates.split(' ')[0]
			if deprecates_name in args:
				raise ValueError("Option %s already has a deprecated alias of %s" % (name, args[deprecates_name]))

			args[deprecates_name] = name
		return args