def _resolve_string(matcher):
	"""
	Get the value from environment given a matcher containing a name and an optional default value in its group dict.
    If the variable is not defined in environment and no default value is provided, an Error is raised.
	"""
	if 'name' not in matcher.groupdict():
		raise ValueError("String matchers must contain a named subgroup.")
	name = matcher.group('name')
	value = os.environ.get(name)
	if not value:
		if 'default' in matcher.groupdict():
			return matcher.group('default')
		else:
			raise KeyError(
				"Environment variable %s was not found for string substitution." % name)
	return value