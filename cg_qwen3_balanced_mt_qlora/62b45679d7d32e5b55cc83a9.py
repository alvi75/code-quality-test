def parser_flags(parser):
	"""
	Given an argparse.ArgumentParser instance, return its argument flags in a space-separated
string.
	"""
	flags = []
	for action in parser._actions:
		if isinstance(action, argparse._SubParsersAction):
			for subparser in action._choices_actions:
				flags.extend(parser_flags(subparser).split())
		else:
			flags.append(action.dest)
	return ' '.join(flags)