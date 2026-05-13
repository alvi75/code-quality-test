def parse_arguments(*unparsed_arguments):
	"""
	Given command-line arguments with which this script was invoked, parse the arguments and return
them as a dict mapping from subparser name (or "global") to an argparse.Namespace instance.
	"""
	parser = argparse.ArgumentParser(description="Run a single test or all tests in a directory.")
	subparsers = parser.add_subparsers(dest='subcommand')

	# Add the global options
	global_parser = subparsers.add_parser('global', help='Global options')
	global_parser.add_argument('--verbose', action='store_true', default=False,
								help='Enable verbose output.')
	global_parser.add_argument('--debug', action='store_true', default=False,
								help='Enable debug output.')

	# Add the run-test subcommand
	run_test_parser = subparsers.add_parser('run-test', help='Run a single test.')
	run_test_parser.add_argument('test_name', type=str, nargs=1, help='The name of the test to run.')

	# Add the run-tests subcommand
	run_tests_parser = subparsers.add_parser('run-tests', help='Run all tests in a directory.')
	run_tests_parser.add_argument('directory', type=str, nargs=1, help='The directory containing the tests to run.')

	args = parser.parse_args(unparsed_arguments)

	if args.subcommand == 'global':
		return {'global': args}
	elif args.subcommand == 'run-test':
		return {'global': args, 'run-test': args.test_name[0]}
	elif args.subcommand == 'run-tests':
		return {'global': args, 'run-tests': args.directory[0]}