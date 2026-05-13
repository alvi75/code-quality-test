def generate_default_observer_schema_dict(manifest_dict, first_level=False):
	"""
	The values corresponding to different keys in the new dict are generated based on the value type (such as dict and list) in the manifest_dict file. Then new dictionary is returned.
	"""
	if not first_level:
		default_observer_schema_dict = {}
	else:
		default_observer_schema_dict = {'default': {}}
	for key, value in manifest_dict.items():
		if isinstance(value, dict):
			default_observer_schema_dict[key] = generate_default_observer_schema_dict(value)
		elif isinstance(value, list):
			default_observer_schema_dict[key] = []
			for item in value:
				if isinstance(item, dict):
					default_observer_schema_dict[key].append(generate_default_observer_schema_dict(item))
				else:
					default_observer_schema_dict[key].append(item)
		else:
			default_observer_schema_dict[key] = value
	return default_observer_schema_dict