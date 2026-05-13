def parse_arguments(*unparsed_arguments):
	"""
	Given command-line arguments with which this script was invoked, parse the arguments and return
them as a dict mapping from subparser name (or "global") to an argparse.Namespace instance.
	"""
	parser = argparse.ArgumentParser()
	subparsers = parser.add_subparsers()

	for subparser in subparsers:
		subparser.add_argument("--verbose", action="store_true")
		subparser.add_argument("--debug", action="store_true")

	global_args = {}
	subparser.set_defaults(**parse_global_options(subparser))

	for subparser in subparsers:
		subparser.set_defaults(func=parse_subcommand_options)

	for argset in unparsed_arguments:
		if not isinstance(argset, list):
			argset = shlex.split(argset)
		args = parser.parse_known_args(argset)[0]
		if args.func is None:
			raise ValueError("No sub-command specified.")
		args.func(args)
		global_args.update(vars(args))
	return global_args