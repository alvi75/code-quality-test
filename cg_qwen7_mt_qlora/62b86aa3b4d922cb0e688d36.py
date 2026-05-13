def _validate_labels(labels):
	"""
	Check that keys and values in the given labels by validate_key() and validate_value().
	"""
	if not isinstance(labels, dict):
		raise TypeError("Labels must be a dictionary")
	for key, value in six.iteritems(labels):
		validate_key(key)
		validate_value(value)