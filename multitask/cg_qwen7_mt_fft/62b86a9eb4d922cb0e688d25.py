def _get_resource_name_regex():
	"""
	Return the regular expressions that are used to validate the name of the Krake resources
	"""

	return re.compile(
		r'^[a-zA-Z0-9\-\_]{1,64}$'
	)