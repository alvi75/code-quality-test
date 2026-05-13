def parse_arguments(*arguments):
	"""
	Given command-line arguments with which this script was invoked, parse the arguments and return  them as an ArgumentParser instance
	"""
	parser = argparse.ArgumentParser(description="Generate a new project from a template")
	parser.add_argument("template", help="The name of the template to use")
	parser.add_argument("name", help="The name of the new project")
	parser.add_argument("-d", "--directory", default=os.getcwd(), help="Directory in which to create the new project")
	parser.add_argument("-v", "--verbose", action="store_true", help="Enable verbose output")
	return parser.parse_args(arguments)