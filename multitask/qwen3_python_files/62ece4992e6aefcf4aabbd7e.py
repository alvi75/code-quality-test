def _resolve_string(matcher):
	"""
	Get the value from environment given a matcher containing a name and an optional default value in its group dict.
    If the variable is not defined in environment and no default value is provided, an Error is raised.
	"""
	name = matcher.group('name')
	value = os.environ.get(name)
	if value is None:
		if 'default' in matcher.groupdict():
			return matcher.groupdict()['default']
		else:
			raise ValueError("Environment variable %s not found" % name)
	else:
		return value