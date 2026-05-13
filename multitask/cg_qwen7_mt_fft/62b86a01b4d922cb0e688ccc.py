def generate_default_observer_schema_dict(manifest_dict, first_level=False):
	"""
	The values corresponding to different keys in the new dict are generated based on the value type (such as dict and list) in the manifest_dict file. Then new dictionary is returned.
	"""

	new_manifest = {}
	for key, val in manifest_dict.items():
		if isinstance(val, dict):
			new_manifest.update({key: generate_default_observer_schema_dict(val)})
		elif isinstance(val, list):
			new_manifest.update({key: [generate_default_value_from_type(item, True) for item in val]})
		else:
			new_manifest.update({key: generate_default_value_from_type(val, False)})
	return new_manifest