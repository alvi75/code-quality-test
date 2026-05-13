def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
instance, give each requested action's subparser a shot at parsing all arguments. This allows
common arguments like "--repository" to be shared across multiple subparsers.

Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
arguments, a list of remaining arguments not claimed by any subparser).
	"""
	subparser_names = set(subparsers.keys())
	parsed_args = {}
	remaining_arguments = []
	for argument in unparsed_arguments:
		if argument in subparser_names:
			subparser_name = argument
			subparser = subparsers[argument]
			# Parse the argument using the subparser.
			# If it fails, we'll try again with the next subparser.
			try:
				# We need to pass the parser to the subparser.add_argument() calls so that they can
				# add their own arguments to the subparser.
				# The subparser.add_argument() calls will return a list of actions for the subparser,
				# which we'll use to determine which subparser was used.
				actions = subparser.parse_known_args([argument] + remaining_arguments)
				# The first element of the returned tuple is the parsed arguments, which we'll store
				# under the subparser's name.
				parsed_args[subparser_name] = actions[0]
				# The second element of the returned tuple is the remaining arguments, which we'll
				# pass to the next subparser.
				remaining_arguments = actions[1]
				break
			except ArgumentError:
				pass
	return parsed_args, remaining_arguments