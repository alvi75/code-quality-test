def parse_arguments(*unparsed_arguments):
	"""
	def parse_arguments(*unparsed_arguments):
	"""
	parser = argparse.ArgumentParser()
	parser.add_argument('command', choices=COMMANDS)
	parser.add_argument('target')
	parser.add_argument('-d', '--debug', action='store_true')
	parser.add_argument('-v', '--verbose', action='store_true')
	parser.add_argument('-V', '--version', action='version',
						version='%(prog)s {0}'.format(__version__))
	parser.add_argument('-c', '--config', dest='config_file',
						default=os.path.join(os.path.expanduser('~'), '.pytodo'),
						help='path to config file (default: ~/.pytodo)')
	parser.add_argument('-o', '--output', dest='output_format',
						default='text',
						choices=['text', 'json'],
						help='output format (default: text)')
	parser.add_argument('-i', '--interactive', action='store_true',
						help='enable interactive mode (default: False)')
	parser.add_argument('-p', '--project-root', dest='project_root',
						default=os.getcwd(),
						help='root directory of project (default: cwd)')
	parser.add_argument('-m', '--module', dest='module_name',
						default=None,
						help='name of module (default: None)')
	parser.add_argument('-s', '--show-commands', action='store_true',
						help='show commands (default: False)')
	parser.add_argument('-t', '--taskfile', dest='taskfile',
						default=None,
						help='path to taskfile (default: None)')
	parser.add_argument('-u', '--update', action='store_true',
						help='update taskfile (default: False)')
	parser.add_argument('-w', '--watch', action='store_true',
						help='watch for changes in taskfile (default: False)')
	parser.add_argument('-x', '--execute', action='store_true',
						help='execute tasks (default: False)')
	parser.add_argument('-y', '--yes', action='store_true',
						help='always answer yes (default: False)')
	parser.add_argument('-z', '--zip', action='store_true',
						help='compress output (default: False)')
	parser.add_argument('--version', action='version',
						version='%(prog)s {0}'.format(__version__))
	parser.add_argument('--help', action='help',
						help='show this help message and exit')

	args = parser.parse_args(unparsed_arguments)

	if args.command == 'new':
		if not os.path.isdir(args