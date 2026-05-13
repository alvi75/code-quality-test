def parse_arguments(*unparsed_arguments):
	"""
	Parses parameters and returns them as dict maps
	"""
	parameters = {}
	for arg in unparsed_arguments:
		if "=" not in arg:
			parameters[arg] = True
		else:
			key, value = arg.split("=", 1)
			parameters[key] = value

	return parameters