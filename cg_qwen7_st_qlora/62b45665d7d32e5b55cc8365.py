def parse_arguments(*unparsed_arguments):
	"""
	Parses parameters and returns them as dict maps
	"""

	if len(unparsed_arguments) == 0:
		return {}

	elif len(unparsed_arguments) > 1:
		raise ValueError("Too many arguments")

	unparsed_argument = unparsed_arguments[0]

	if isinstance(unparsed_argument, str):
		unparsed_argument = [unparsed_argument]
	else:
		unparsed_argument = list(unparsed_argument)

	parsed_arguments = {}
	for argument in unparsed_argument:

		if not isinstance(argument, str):
			raise TypeError("Argument must be a string or a list of strings")

		if "=" not in argument:
			raise ValueError("Invalid argument: %s" % argument)

		key, value = argument.split("=")
		parsed_arguments[key] = value

	return parsed_arguments