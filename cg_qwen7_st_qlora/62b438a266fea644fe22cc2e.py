def parse_arguments(*unparsed_arguments):
	"""
	Given command-line arguments with which this script was invoked, parse the arguments and return
them as a dict mapping from subparser name (or "global") to an argparse.Namespace instance.
	"""

	parser = argparse.ArgumentParser(add_help=False)
	subparsers = parser.add_subparsers(dest="subcommand")
	for subparser in _SUBPARSERS:
		subparser(subparsers)

	args = vars(parser.parse_args(unparsed_arguments))
	if args["subcommand"] is None:
		parser.print_usage()
	else:
		return {args["subcommand"]: args}