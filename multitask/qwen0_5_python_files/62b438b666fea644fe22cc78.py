def parse_arguments(*arguments):
	"""
	Given command-line arguments with which this script was invoked, parse the arguments and return  them as an ArgumentParser instance
	"""
	parser = argparse.ArgumentParser(description='A simple example of a command line tool')
	parser.add_argument('input', help='Input file to be processed')
	parser.add_argument('-o', '--output', default=None, help='Output file for results')
	parser.add_argument('-d', '--debug', action='store_true', help='Enable debug output')
	parser.add_argument('-v', '--verbose', action='store_true', help='Increase verbosity')
	parser.add_argument('-h', '--help', action='help', help='Show this help message and exit')
	return parser.parse_known_args()