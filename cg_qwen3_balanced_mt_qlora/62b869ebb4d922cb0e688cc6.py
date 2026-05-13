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
	for i, field in enumerate(observer_schema):
		if isinstance(field, dict):
			if field.get('type') == 'list':
				if len(last_applied_manifest) <= i:
					last_applied_manifest.append([])
				update_last_applied_manifest_list_from_resp(
					last_applied_manifest[i],
					field['items'],
					response[i]
				)
			else:
				if len(last_applied_manifest) <= i:
					last_applied_manifest.append(None)
				update_last_applied_manifest_dict_from_resp(
					last_applied_manifest[i],
					field,
					response[i]
				)
		else:
			if len(last_applied_manifest) <= i:
				last_applied_manifest.append(None)
			last_applied_manifest[i] = response[i]