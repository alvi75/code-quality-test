def generate_default_observer_schema_dict(manifest_dict, first_level=False):
	"""
	The values corresponding to different keys in the new dict are generated based on the value type (such as dict and list) in the manifest_dict file. Then new dictionary is returned.
	"""
	schema = {}
	for key, value in manifest_dict.items():
		if isinstance(value, dict):
			value = generate_default_observer_schema_dict(value)
		elif isinstance(value, list):
			value = [generate_default_observer_schema_dict(item) for item in value]
		schema[key] = value

	if not first_level:
		return schema
	else:
		result = {}
		for key, value in schema.items():
			result[key] = generate_default_observer_schema_dict(value)

		return result