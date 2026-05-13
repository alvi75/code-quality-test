def parse_arguments(*arguments):
	"""
	Given command-line arguments with which this script was invoked, parse the arguments and return  them as an ArgumentParser instance
	"""
	parser = argparse.ArgumentParser(description='Run a pipeline of tasks')
	parser.add_argument('pipeline', metavar='pipeline', type=str, help='The name of the pipeline to run')
	parser.add_argument('-p', '--parameters', metavar='PARAMETER=VALUE', action='append', dest='parameters', default=[], help='Parameters for the pipeline')
	parser.add_argument('-v', '--verbose', action='store_true', dest='verbose', help='Verbose output')
	parser.add_argument('-d', '--debug', action='store_true', dest='debug', help='Debug output')
	parser.add_argument('-s', '--show', action='store_true', dest='show', help='Show the pipeline without running it')
	parser.add_argument('-c', '--clear-cache', action='store_true', dest='clear_cache', help='Clear the task cache before running the pipeline')
	parser.add_argument('-m', '--meta', action='store_true', dest='meta', help='Print out meta information about the pipeline')
	parser.add_argument('-t', '--task', metavar='TASK', type=str, nargs='+', dest='tasks', help='Only run the specified tasks')
	parser.add_argument('-x', '--exclude', metavar='TASK', type=str, nargs='+', dest='exclude_tasks', help='Exclude the specified tasks')
	parser.add_argument('-o', '--output', metavar='OUTPUT', type=str, dest='output', help='Output directory')
	parser.add_argument('-i', '--interactive', action='store_true', dest='interactive', help='Prompt user for input when possible')
	parser.add_argument('-n', '--dry-run', action='store_true', dest='dry_run', help='Dry run mode - do not execute any tasks')
	parser.add_argument('-u', '--update', action='store_true', dest='update', help='Update all tasks from their sources')
	parser.add_argument('-w', '--watch', action='store_true', dest='watch', help='Watch source files for changes and automatically re-run affected tasks')
	parser.add_argument('-a', '--all', action='store_true', dest='all', help='Run all tasks (except excluded)')
	parser.add_argument('-e', '--env', metavar='ENVIRONMENT', type=str, dest='environment', help='Environment variables to set when running the pipeline')
	parser.add_argument('-r', '--runas', metavar='USER