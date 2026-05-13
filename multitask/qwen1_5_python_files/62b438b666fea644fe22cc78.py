def parse_arguments(*arguments):
		"""
		Given command-line arguments with which this script was invoked, parse the arguments and return  them as an ArgumentParser instance
		"""
		parser = argparse.ArgumentParser()
		for argument in arguments:
			if isinstance(argument, (list, tuple)):
				parser.add_argument(*argument)
			else:
				parser.add_argument(argument)

		return parser.parse_args()