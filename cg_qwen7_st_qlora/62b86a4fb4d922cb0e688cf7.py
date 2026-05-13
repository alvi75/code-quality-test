def validate_key(key):
	"""
	def validate_key(key):
	"""
	if not isinstance(key, str) or len(key) == 0:
		raise ValueError("Key must be a non-empty string")
	if not re.match(r'^[a-zA-Z][a-zA-Z0-9_]*$', key):
		raise ValueError("Invalid key: %s" % key)
	return True