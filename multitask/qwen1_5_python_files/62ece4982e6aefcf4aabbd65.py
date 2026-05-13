def parser_flags(parser):
	"""
	Given an argparse.ArgumentParser instance, return its argument flags in a space-separated string.
    Args:
        script: argparse.ArgumentParser instance

    Returns:
        argument flags in a space-separated string
	"""
	flags = []
	for action in parser._actions:
		if isinstance(action, _SubParsersAction):
			continue
		elif hasattr(action, 'option_strings'):
			flags += [flag.lstrip('-') for flag in action.option_strings]
	return " ".join(flags)