def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
instance, give each requested action's subparser a shot at parsing all arguments. This allows
common arguments like "--repository" to be shared across multiple subparsers.

Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
arguments, a list of remaining arguments not claimed by any subparser).
	"""

	# First pass: try to parse everything with every parser.
	parsed = {}
	for subparser_name in sorted(subparsers.keys()):
		parser = subparsers[subparser_name]
		try:
			namespace = parser.parse_known_args(unparsed_arguments)[0]
			if hasattr(namespace, 'action'):
				parsed[subparser_name] = namespace
				unparsed_arguments = []
				break
		except SystemExit:
			pass

	# Second pass: if we didn't find a match for one or more actions, just use the first parser that
	# can parse it.
	if unparsed_arguments:
		for subparser_name in sorted(subparsers.keys()):
			parser = subparsers[subparser_name]
			try:
				namespace = parser.parse_known_args(unparsed_arguments)[0]
				if hasattr(namespace, 'action'):
					parsed[subparser_name] = namespace
					unparsed_arguments = []
					break
			except SystemExit:
				pass

	return parsed, unparsed_arguments