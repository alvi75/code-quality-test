def parser_flags(parser):
	"""
	Given an argparse.ArgumentParser instance, return its argument flags in a space-separated string.
    Args:
        script: argparse.ArgumentParser instance

    Returns:
        argument flags in a space-separated string
	"""
	args = [arg for arg in parser._actions if not isinstance(arg, _ArgumentDefaultsHelpAction)]
	return ' '.join([arg.dest for arg in args])