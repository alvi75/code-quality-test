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
    for field_name in observer_schema["fields"]:
        # If we have no data for that key, initialize it as None.
        # This will be used later when updating the manifest list
        try:
            item = response[field_name]
        except KeyError:
            last_applied_manifest.append(None)
            continue

        # If there's sub items, call this method recursively
        if "items" in item:
            last_applied_manifest.append([])
            update_last_applied_manifest_list_from_resp(
                last_applied_manifest[-1], item["items"], response["items"]
            )
            continue

        # If it's a dict, just append the whole object
        elif isinstance(item, dict):
            last_applied_manifest.append(item)

        else:
            raise TypeError("item should either be a dict or a list")

    return last_applied_manifest