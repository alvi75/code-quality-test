def validate_value(value):
	"""
	Validate the given value against the corresponding regular expression.
	"""

	if not isinstance(value, str) or len(value) == 0:
		return False

	for regex in REGEXES.values():
		if re.match(regex, value):
			return True

	return False