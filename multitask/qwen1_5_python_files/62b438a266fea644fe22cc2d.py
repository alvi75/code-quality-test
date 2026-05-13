def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
	instance, give each requested action's subparser a shot at parsing all arguments. This allows
	common arguments like "--repository" to be shared across multiple subparsers.

Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
arguments, a list of remaining arguments not claimed by any subparser).
	"""
	subparser_names = set(subparser.name for subparser in subparsers.values())
	parsed_arguments = {}
	unclaimed_arguments = []
	for argument_string in unparsed_arguments:
		if argument_string.startswith('--'):
			split_argument = argument_string[2:]
			key_match = re.match(r'([a-z_]+)(?:=([^=]+))?', split_argument)
			if key_match is None:
				raise ValueError('Invalid option: %s' % argument_string)
			key = key_match.group(1).lower()
			value = key_match.group(3) if key_match.group(3) else True
			if key not in subparser_names:
				raise ValueError('Unknown option: %s' % argument_string)
			elif key == 'help':
				raise ValueError('The help subparser cannot be used directly')
			elif key in ('version', 'verbose', 'quiet'):
				value = value.lower() == 'true'
			parsed_arguments[key] = value
		else:
			unclaimed_arguments.append(argument_string)

	return parsed_arguments, unclaimed_arguments