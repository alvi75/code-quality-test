def validate_value(value):
	"""
	Validate the given value against the corresponding regular expression.
	"""
	if not isinstance(value, basestring):
		return False

	for regex in REGEXES:
		if re.match(regex[1], value) is None:
			continue
		else:
			return True

	return False