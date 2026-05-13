def update_last_applied_manifest_list_from_resp(
    last_applied_manifest, observer_schema, response
):
	"""
	Together with :func:``update_last_applied_manifest_dict_from_resp``, this
	function is called recursively to update a partial ``last_applied_manifest``
	from a partial Kubernetes response

Args:
    last_applied_manifest (list): partial ``last_applied_manifest`` being
        updated
    observer_schema (list): partial ``observer_schema``
    response (list): partial response from the Kubernetes API.

This function go through all observed fields, and initialized their value in
last_applied_manifest if they are not yet present
	"""
	for field in observer_schema:
		if field in last_applied_manifest:
			continue
		last_applied_manifest.append(field)
		last_applied_manifest[field] = {}
		last_applied_manifest[field]["observed"] = False
		last_applied_manifest[field]["value"] = None
		last_applied_manifest[field]["last_update"] = 0
		last_applied_manifest[field]["last_seen"] = 0
		last_applied_manifest[field]["last_applied"] = 0
		last_applied_manifest[field]["last_applied_timestamp"] = 0
		last_applied_manifest[field]["last_applied_timestamp_utc"] = 0
		last_applied_manifest[field]["last_applied_timestamp_local"] = 0
		last_applied_manifest[field]["last_applied_timestamp_local_utc"] = 0
		last_applied_manifest[field]["last_applied_timestamp_local_local"] = 0
		last_applied_manifest[field]["last_applied_timestamp_local_local_utc"] = 0
		last_applied_manifest[field]["last_applied_timestamp_local_utc"] = 0
		last_applied_manifest[field]["last_applied_timestamp_utc"] = 0
		last_applied_manifest[field]["last_applied_timestamp_utc_utc"] = 0
		last_applied_manifest[field]["last_applied_timestamp_utc_local"] = 0
		last_applied_manifest[field]["last_applied_timestamp_local_utc"] = 0
		last_applied_manifest[field]["last_applied_timestamp_local_local"] = 0
		last_applied_manifest[field]["last_applied_timestamp_local_utc"] = 0
		last_applied_manifest[field]["last_applied_timestamp_utc_local"] = 0
		last_applied_manifest[field]["last_applied_timestamp_utc_utc"] = 0
		last_applied_manifest[field]["last_ap