def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
instance, give each requested action's subparser a shot at parsing all arguments. This allows
common arguments like "--repository" to be shared across multiple subparsers.

Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
arguments, a list of remaining arguments not claimed by any subparser).
	"""

	parser = argparse.ArgumentParser(add_help=False)
	parser.add_argument("--repository", help="Path to repository")
	args, unparsed_arguments = parser.parse_known_args(unparsed_arguments)

	subparser_names = [name for name in subparsers if name in args.repository]
	if len(subparser_names) == 0:
		raise ValueError("No subparser found for repository %s" % args.repository)

	parsed_arguments = {}
	for subparser_name in subparser_names:
		subparser = subparsers[subparser_name]

		try:
			namespace = subparser.parse_args(args=unparsed_arguments)
			parsed_arguments[subparser_name] = namespace

		except SystemExit:
			pass

	return parsed_arguments, unparsed_arguments