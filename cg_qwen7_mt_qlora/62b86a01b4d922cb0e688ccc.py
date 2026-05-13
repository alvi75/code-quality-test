def generate_default_observer_schema_dict(manifest_dict, first_level=False):
	"""
	The values corresponding to different keys in the new dict are generated based on the value type (such as dict and list) in the manifest_dict file. Then new dictionary is returned.
	"""

	if not isinstance(manifest_dict, dict):
		raise TypeError("The input should be a dictionary")

	new_dict = {}
	for key, val in manifest_dict.items():
		if isinstance(val, dict):
			new_dict[key] = generate_default_observer_schema_dict(val)
		elif isinstance(val, list):
			new_dict[key] = [generate_default_observer_schema_dict(item) for item in val]
		else:
			new_dict[key] = None

	return new_dict