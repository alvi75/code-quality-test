def validate_value(value):
	"""
	Validate the given value against the corresponding regular expression.
	"""
	if not isinstance(value, str):
		return False

	if value in _invalid_values:
		return False

	if value in _valid_values:
		return True

	if re.match(_regex, value):
		_valid_values.add(value)
		return True

	_invalid_values.add(value)
	return False