def validate_value(value):
	"""
	Validate the given value against the corresponding regular expression.
	"""
	if not isinstance(value, str):
		raise TypeError("Value must be a string")
	if len(value) > 0:
		value = re.sub(r"\s+", " ", value)
		value = value.strip()
		if not value:
			return None

		if value[0] in ["@", "#"]:
			value = value[1:]
		elif value[0:2] == "@:":
			value = value[2:]

		if value[-1] in [",", ";"]:
			value = value[:-1]
		elif value[-2:] == ";:":
			value = value[:-2]

		if ":" in value:
			value = value.split(":")[1].strip()

		return value