def _resolve_string(matcher):
	"""
	Get the value from environment given a matcher containing a name and an optional default value in its group dict.
    If the variable is not defined in environment and no default value is provided, an Error is raised.
	"""
	name = matcher.groupdict().get('name')
	default_value = matcher.groupdict().get('default')

	if name in os.environ:
		return os.environ[name]
	elif default_value:
		return default_value
	else:
		raise ValueError("Missing required environment variable: %s" % name)