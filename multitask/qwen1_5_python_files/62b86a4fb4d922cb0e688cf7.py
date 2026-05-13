def validate_key(key):
	"""
	Validate the given key against the corresponding regular expression.
	"""
	if not isinstance(key, str):
		raise TypeError("Key must be a string")
	if len(key) < 3:
		raise ValueError("Key too short")
	elif len(key) > 256:
		raise ValueError("Key too long")