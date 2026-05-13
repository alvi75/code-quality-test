def validate_value(value):
	"""
	Validate the given value against the corresponding regular expression.
	"""
	if isinstance(value, bool):
		return

	if not isinstance(value, six.string_types):
		raise ValueError("Value must be a string.")

	value = value.lower()
	if value in ("true", "1", "on"):
		return True
	elif value in ("false", "0", "off"):
		return False

	raise ValueError("Invalid boolean representation: %s" % repr(value))