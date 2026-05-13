def parse_arguments(*unparsed_arguments):
	"""
	Parses parameters and returns them as dict maps
	"""
	parser = argparse.ArgumentParser()
	parser.add_argument('--version', action='store_true')
	parser.add_argument('-v', '--verbose',
						help="increase verbosity of output to INFO level",
						action='store_true')
	parser.add_argument('-q', '--quiet',
						help="silence most output (errors only)",
						action='store_true')
	parser.add_argument('config_file', nargs='?',
						help="the configuration file")
	args, remaining_args = parser.parse_known_args(unparsed_arguments)
	if args.version:
		print_version()
		sys.exit(0)

	return vars(args), remaining_args