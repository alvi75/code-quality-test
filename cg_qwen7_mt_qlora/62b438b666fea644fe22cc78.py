def parse_arguments(*arguments):
	"""
	Given command-line arguments with which this script was invoked, parse the arguments and return  them as an ArgumentParser instance
	"""

	parser = argparse.ArgumentParser(description='A simple utility to convert a CSV file into a JSON file.')
	parser.add_argument('csv_file', help="The path to the CSV file")
	parser.add_argument('-o', '--output', default=None,
						help="The output file (default: stdout)")
	parser.add_argument('--delimiter', default=',',
						help="The delimiter used in the input CSV file (default: ',')")
	parser.add_argument('--quotechar', default='"',
						help="The quote character used in the input CSV file (default: '\"')")

	return parser.parse_args(arguments)