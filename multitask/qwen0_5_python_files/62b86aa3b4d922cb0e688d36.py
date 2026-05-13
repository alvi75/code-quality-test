def _validate_labels(labels):
	"""
	Check that keys and values in the given labels by validate_key() and validate_value().
	"""
	for key, value in six.iteritems(labels):
		if not isinstance(key, basestring):
			raise TypeError("Labels must be a dict of strings to strings")
		if not isinstance(value, basestring):
			raise TypeError("Labels must be a dict of strings to strings")

		if key == "":
			raise ValueError("Label key cannot be empty")
		if value == "":
			raise ValueError("Label value cannot be empty")