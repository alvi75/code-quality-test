def _resolve_string(matcher):
	"""
	Get the value from environment given a matcher containing a name and an optional default value in its group dict.
    If the variable is not defined in environment and no default value is provided, an Error is raised.
	"""
	if '!' in matcher:
		var_name = matcher.split('!', 1)[0]
		default_value = matcher.split('!', 1)[1] if len(matcher) > 2 else None

		try:
			value = os.environ[var_name]
		except KeyError:
			if default_value is not None:
				return default_value
			raise EnvironmentError("Missing required environment variable: {}".format(var_name))

		return value
	else:
		return os.environ[matcher]