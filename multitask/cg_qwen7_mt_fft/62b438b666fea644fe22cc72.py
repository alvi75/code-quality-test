def parser_flags(parser):
	"""
	Given an argparse.ArgumentParser instance, return its argument flags in a space-separated
string.
	"""
	return ' '.join([flag for flag in chain.from_iterable(arg.split() for arg in parser.format_help().splitlines()) if flag.startswith('-')])