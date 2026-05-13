def parser_flags(parser):
	"""
	Given an argparse.ArgumentParser instance, return its argument flags in a space-separated
	string.
	"""
	return ' '.join(['{}={}'.format(k, v) for k, v in sorted(parser._get_named_values())])