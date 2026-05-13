def generate_default_observer_schema_dict(manifest_dict, first_level=False):
	"""
	The values corresponding to different keys in the new dict are generated based on the value type (such as dict and list) in the manifest_dict file. Then new dictionary is returned.
	"""
	if not isinstance(manifest_dict, dict):
		raise ValueError("The input must be a dictionary")
	# The schema for the manifest key itself
	schema = {
			"manifest": {
				"type": "object",
				"$id": "#/properties/manifest"
			}
	}

	for k,v in manifest_dict.items():
		if not isinstance(v, dict):
			raise ValueError("The value of each item in the manifest_dict must be a dictionary")

		# If it's a primitive type like string or int, then we just use that
		if all([isinstance(v[k], t) for t in [str, int, float, bool]]):
			schema["manifest"]["properties"][k] = {
					"type": "array",
					"items": {
						"type": v[k].get('type', 'string')
					}
				}

		elif all([isinstance(v[k], list) and all([isinstance(i, t) for t in [str, int, float, bool]]) for i in v[k]]):
			schema["manifest"]["properties"][k] = {
					"type": "array",
					"items": {
						"type": v[k][0].get('type', 'string')
					}
				}

		elif isinstance(v[k], dict):
			schema["manifest"]["properties"][k] = {
					"type": "object",
					"$id": "#/properties/manifest/"+k,
					"additionalProperties": False
				}

		elif isinstance(v[k], list):
			schema["manifest"]["properties"][k] = {
					"type": "array",
					"items": {
						"type": v[k][0].get('type', 'string')
					}
				}


	if not first_level:
		return schema

	else:
		return {
			"allOf": [
				{
					"schema": schema
				},
				{
					"format": "uuid"
				}
			]
		}