def _validate_labels(labels):
	"""
	Check that keys and values in the given labels by validate_key() and validate_value().
	"""
	if not isinstance(labels, dict):
		raise TypeError("Labels must be a dictionary")
	for key, value in labels.items():
		try:
			_validate_label(key)
			_validate_label(value)
		except ValueError as e:
			raise ValueError("Invalid label: %s" % str(e))