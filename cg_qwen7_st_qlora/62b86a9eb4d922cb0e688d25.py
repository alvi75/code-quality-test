def _get_resource_name_regex():
	"""
	Return the regular expressions that are used to validate the name of the Krake resources
	"""
	global RESOURCE_NAME_REGEX

	if not RESOURCE_NAME_REGEX:
		resource_names = [resource.name for resource in Resource.list()]
		resource_names.sort()
		RESOURCE_NAME_REGEX = re.compile(
			r'^(' + '|'.join(resource_names) + r')$'
		)

	return RESOURCE_NAME_REGEX