def _resolve_string(matcher):
	"""
	Get the value from environment given a matcher containing a name and an optional default value in its group dict.
    If the variable is not defined in environment and no default value is provided, an Error is raised.
	"""
	value = os.environ.get(matcher.group(1))
	if value:
		return value
	elif matcher.group(2) is None:
		raise ValueError("Environment variable %s was not found" % matcher.group(1))
	else:
		return matcher.group(2)