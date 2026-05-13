def update_last_applied_manifest_dict_from_resp(
    last_applied_manifest, observer_schema, response
):
	"""
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
"""

	for k, v in list(response.items()):
		if k == "observed":
			continue
		elif isinstance(v, dict):
			update_last_applied_manifest_dict_from_resp(last_applied_manifest,
			                                           observer_schema, v)
		elif isinstance(v, list):
			last_applied_manifest[k] = []
			for item in v:
				if isinstance(item, dict):
					update_last_applied_manifest_dict_from_resp(last_applied_manifest,
					                                           observer_schema, item)
				elif isinstance(item, list):
					last_applied_manifest[k].append(item)
				else:
					last_applied_manifest[k].append(item.__dict__)
		elif isinstance(v, str):
			last_applied_manifest[k] = v
		elif isinstance(v, int):
			last_applied_manifest[k] = v
		elif isinstance(v, float):
			last_applied_manifest[k] = v
		elif isinstance(v, bool):
			last_applied_manifest[k] = v
		elif isinstance(v, six.text_type):
			last_applied_manifest[k] = v
		elif isinstance(v, datetime.datetime):
			last_applied_manifest[k] = v.isoformat()
		elif isinstance(v, six.binary_type):
			last_applied_manifest[k] = base64.b64decode(v).decode('utf-8')
		elif isinstance(v, six.binary_type):
			last_applied_manifest[k] = v.decode('utf-8')
		elif isinstance(v, six.binary_type):
			last_applied_manifest[k] = v.decode('utf-8')
		elif isinstance(v, six.binary_type):
			last_applied_manifest[k] = v.decode('utf-8')
		elif isinstance(v, six.binary_type):
			last_applied_manifest[k] = v.decode('utf