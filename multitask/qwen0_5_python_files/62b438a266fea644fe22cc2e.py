def parse_arguments(*unparsed_arguments):
	"""
	Given command-line arguments with which this script was invoked, parse the arguments and return
them as a dict mapping from subparser name (or "global") to an argparse.Namespace instance.
	"""
	parser = argparse.ArgumentParser()
	parser.add_argument('command', nargs='?', default=None)
	parser.add_argument('--version', action='version',
						version=__version__)
	parser.add_argument('-v', '--verbose', action='count', default=0,
						help="increase verbosity")
	parser.add_argument('-q', '--quiet', action='count', default=0,
						help="decrease verbosity")
	parser.add_argument('-h', '--help', action='help',
						help="show help message for current command")
	parser.add_argument('-d', '--debug', action='count', default=0,
						help="increase verbosity")
	parser.add_argument('-q', '--quiet', action='count', default=0,
						help="decrease verbosity")
	parser.add_argument('-p', '--path', metavar='PATH', type=str,
						default=os.getcwd(),
						help="directory where to search modules")
	parser.add_argument('-r', '--recursive', action='store_true',
						default=False,
						help="search recursively in subdirectories")
	parser.add_argument('-i', '--ignore', metavar='IGNORE', type=str,
						default='',
						help="list of files to ignore")
	parser.add_argument('-l', '--log', metavar='LOG', type=str,
						default='default',
						help="logging file or stdout")
	parser.add_argument('-L', '--logfile', metavar='FILE', type=str,
						default='default',
						help="file to write log messages")
	parser.add_argument('-f', '--format', metavar='FORMAT', type=str,
						default='json',
						help="JSON format: json|yaml|toml|ini|json5|toml5|ini5|json6|toml6|ini6|json7|toml7|ini7|json8|toml8|ini8|json9|toml9|ini9|json10|toml10|ini10|json11|toml11|ini11|json12|toml12|ini12|json13|toml13|ini13|json14|toml14|ini14|json15|toml15|ini15|json16|tom