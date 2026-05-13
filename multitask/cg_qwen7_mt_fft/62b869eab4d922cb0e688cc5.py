def update_last_applied_manifest_dict_from_resp(
    last_applied_manifest, observer_schema, response
):
	"""
	Together with :func:``update_last_applied_manifest_list_from_resp``, this
	function is called recursively to update a partial ``last_applied_manifest``
	from a partial Kubernetes response

Args:
    last_applied_manifest (dict): partial ``last_applied_manifest`` being
        updated
    observer_schema (dict): partial ``observer_schema``
    response (dict): partial response from the Kubernetes API.

Raises:
    KeyError: If the observed field is not present in the Kubernetes response

This function go through all observed fields, and initialized their value in
last_applied_manifest if they are not yet present
	"""
	for key, item in observer_schema["properties"].items():
		if "type" in item:
			last_applied_manifest[key] = None
		elif "properties" in item:
			if isinstance(item["properties"], list):
				for subitem in item["properties"]:
					last_applied_manifest[key][subitem["name"]] = None
			else:
				update_last_applied_manifest_dict_from_resp(
					last_applied_manifest.get(key, {}), item["properties"], response[key]
				)
	return last_applied_manifest