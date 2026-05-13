def parse_arguments(*unparsed_arguments):
	"""
	Parses parameters and returns them as dict maps
	"""
	args = {}
	for arg in unparsed_arguments:
		if '=' in arg:
			key, value = arg.split('=')
			args[key] = value
	return args