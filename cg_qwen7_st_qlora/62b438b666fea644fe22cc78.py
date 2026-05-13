def parse_arguments(*arguments):
	"""
	Given command-line arguments with which this script was invoked, parse the arguments and return  them as an ArgumentParser instance
	"""

	parser = argparse.ArgumentParser(description='A simple utility to generate a list of all files in a directory')
	parser.add_argument('directory', help="The directory from which to retrieve files")
	parser.add_argument('-r', '--recursive', action='store_true',
						help="Recursively search subdirectories for files")
	parser.add_argument('--include-hidden', action='store_true',
						help="Include hidden files (those starting with '.')")
	parser.add_argument('--include-directories', action='store_true',
						help="Include directories in results")

	return parser.parse_args(arguments)