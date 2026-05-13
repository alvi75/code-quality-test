def _validate_labels(labels):
	"""
	Check that keys and values in the given labels by validate_key() and validate_value().
	"""
	if not isinstance(labels, dict):
		raise TypeError("labels must be a dictionary")
	for key, value in iteritems(labels):
		_validate_key(key)
		_validate_value(value)