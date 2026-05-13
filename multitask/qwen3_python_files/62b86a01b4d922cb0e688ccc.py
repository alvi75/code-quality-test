def generate_default_observer_schema_dict(manifest_dict, first_level=False):
	"""
	The values corresponding to different keys in the new dict are generated based on the value type (such as dict and list) in the manifest_dict file. Then new dictionary is returned.
	"""
	if not isinstance(manifest_dict, dict):
		raise ValueError("Manifest must be a dictionary")
	if first_level:
		return {k: generate_default_observer_schema_dict(v, False) for k, v in manifest_dict.items()}
	else:
		return {k: generate_default_observer_schema_dict(v, True) if isinstance(v, dict) else v for k, v in manifest_dict.items()}