def _get_resource_name_regex():
	"""
	Return the regular expressions that are used to validate the name of the Krake resources
	"""
	return {
		"pod": r"^([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\.)*([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?)$",
		"service": r"^([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\.)*([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?)$",
		"deployment": r"^([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\.)*([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?)$",
		"replication-controller": r"^([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\.)*([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?)$",
		"persistent-volume": r"^([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\.)*([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?)$",
		"storage-class": r"^([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\.)*([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?)$",
		"storage": r"^([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\.)*([a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?)$",
		"storageos": r"^([