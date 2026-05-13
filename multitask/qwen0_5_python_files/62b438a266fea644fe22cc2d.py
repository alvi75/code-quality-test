def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
	instance, give each requested action's subparser a shot at parsing all arguments. This allows
	common arguments like "--repository" to be shared across multiple subparsers.

	Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
	arguments, a list of remaining arguments not claimed by any subparser).
	"""
	subparser_to_namespace = {subparser: Namespace() for subparser in subparsers}
	remaining_arguments = unparsed_arguments

	for parser_name, parser in six.iteritems(subparsers):
		parser_args = parser.parse_known_args(remaining_arguments)
		subparser_to_namespace[parser_name].update(parser_args.__dict__)
		remaining_arguments = remaining_arguments[len(parser_args.args):]

	return subparser_to_namespace, remaining_arguments