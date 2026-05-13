def validate_key(key):
	"""
	Validate the given key against the corresponding regular expression.
	"""
	if not isinstance(key, six.string_types):
		return False

	for regex in REGEXES:
		if re.match(regex, key) is not None:
			return True

	return False