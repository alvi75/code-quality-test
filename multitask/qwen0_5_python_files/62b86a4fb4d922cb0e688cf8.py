def validate_value(value):
	"""
	Validate the given value against the corresponding regular expression.
	"""
	if not isinstance(value, basestring):
		raise TypeError("value must be a string")
	value = str(value)
	if re.match(r'\d+', value) is None:
		raise ValueError("value '%s' does not match regex" % (value,))
	return value