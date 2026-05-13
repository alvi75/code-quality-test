def _validate_labels(labels):
	"""
	Check that keys and values in the given labels by validate_key() and validate_value().
	"""
	for key, value in labels.items():
		if not isinstance(key, str):
			raise TypeError("Label key must be a string.")
		if not isinstance(value, str):
			raise TypeError("Label value must be a string.")

	return True