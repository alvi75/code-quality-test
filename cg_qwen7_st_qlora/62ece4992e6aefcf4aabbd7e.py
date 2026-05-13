def _resolve_string(matcher):
	"""
	Get the value from environment given a matcher containing a name and an optional default value in its group dict.
    If the variable is not defined in environment and no default value is provided, an Error is raised.
	"""

	if 'name' not in matcher.groupdict():
		raise ValueError("Invalid string matcher: {}".format(matcher))

	name = matcher.group('name')
	default_value = matcher.group('default')

	return os.environ.get(name, default_value)