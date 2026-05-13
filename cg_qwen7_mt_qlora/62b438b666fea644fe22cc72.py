def parser_flags(parser):
	"""
	Given an argparse.ArgumentParser instance, return its argument flags in a space-separated
string.
	"""
	flags = []
	for action in parser._actions:
		if not isinstance(action, argparse._SubParsersAction) and \
				not isinstance(action, argparse._HelpAction):
			flag = action.option_strings[0]
			if flag.startswith('--'):
				flag = flag.replace('-', '_')
			else:
				flag = flag.replace('-', '')
			flags.append(flag)
	return ' '.join(flags)