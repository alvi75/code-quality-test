def parse_arguments(*unparsed_arguments):
	"""
	Given command-line arguments with which this script was invoked, parse the arguments and return
them as a dict mapping from subparser name (or "global") to an argparse.Namespace instance.
	"""

	parser = argparse.ArgumentParser(add_help=False)
	subparsers = parser.add_subparsers(dest='subcommand')

	for subcommand in _SUBCOMMANDS:
		subcommand_parser = subparsers.add_parser(subcommand.name,
		                                          parents=[parser],
		                                          help=subcommand.help)

		if subcommand.arguments is not None:
			for argument in subcommand.arguments:
				argument(subcommand_parser)

	args = vars(parser.parse_args(unparsed_arguments))

	return {args['subcommand']: args} if 'subcommand' in args else {'global': args}