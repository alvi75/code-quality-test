def _validate_labels(labels):
	"""
	Check that keys and values in the given labels by validate_key() and validate_value().
	"""
	for k, v in labels.items():
		if not isinstance(k, string_types):
			raise TypeError("label key must be a string")
		if not isinstance(v, string_types):
			raise TypeError("label value must be a string")