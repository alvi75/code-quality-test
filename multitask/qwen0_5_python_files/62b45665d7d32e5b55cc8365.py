def parse_arguments(*unparsed_arguments):
	"""
	Parses parameters and returns them as dict maps
	"""
	parser = argparse.ArgumentParser()
	parser.add_argument('command', nargs='?', default=None)
	parser.add_argument('args', nargs='*', default=None)
	return vars(parser.parse_known_args()[0])