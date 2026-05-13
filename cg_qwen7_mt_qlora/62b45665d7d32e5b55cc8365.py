def parse_arguments(*unparsed_arguments):
	"""
	Parses parameters and returns them as dict maps
	"""

	if len(unparsed_arguments) == 0:
		return {}

	elif len(unparsed_arguments) > 1:
		raise ValueError("Too many arguments")

	else:
		unparsed_argument = unparsed_arguments[0]

		if isinstance(unparsed_argument, str):
			return _parse_string(unparsed_argument)

		elif isinstance(unparsed_argument, (list, tuple)):
			return _parse_list(unparsed_argument)

		else:
			raise TypeError("Invalid argument type: %s" % type(unparsed_argument))