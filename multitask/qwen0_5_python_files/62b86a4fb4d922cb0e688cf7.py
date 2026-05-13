def validate_key(key):
	"""
	Validate the given key against the corresponding regular expression.
	"""
	if not re.match(r'^[a-zA-Z0-9_]+$', key):
		raise ValueError('Invalid key: %s' % key)
	return True