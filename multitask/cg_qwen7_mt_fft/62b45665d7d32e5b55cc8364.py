def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
instance, give each requested action's subparser a shot at parsing all arguments. This allows
common arguments like "--repository" to be shared across multiple subparsers.

Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
arguments, a list of remaining arguments not claimed by any subparser).
	"""

	parsed_args = {}
	remaining_args = unparsed_arguments[:]
	for subparser_name in sorted(subparsers.keys()):
		subparser = subparsers[subparser_name]
		try:
			args = parser.parse_known_args(remaining_args)
		except SystemExit:
			continue

		if args is None or len(vars(args)) == 0:
			continue

		# If we have common flags for this subcommand, add them to the global arg dict.
		global_vars = vars(parsed_args)

		for key in getattr(args, '_action_strings', []):
			if hasattr(global_vars, key) and getattr(global_vars, key) != getattr(args, key):
				raise Exception("Conflicting values for flag %s: first value was %r but "
				                "subcommand %r has conflicting value %r"
				                % (key, getattr(global_vars, key), subparser_name,
					   getattr(args, key)))

		setattr(global_vars, key, getattr(args, key))

		# Update our remaining args with what wasn't matched by actions
		remaining_args = [arg for arg in remaining_args if arg[0] != '-']
		parsed_args[subparser_name] = args
	return parsed_args, remaining_args