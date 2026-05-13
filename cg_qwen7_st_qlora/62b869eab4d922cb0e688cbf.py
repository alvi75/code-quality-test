def generate_default_observer_schema(app):
	"""
	Generate the default observer schema for each Kubernetes resource present in ``spec.manifest`` for which a custom observer schema hasn't been specified.
	"""

	for k8s_resource, k8s_resource_spec in app.spec.manifest.items():
		if not hasattr(k8s_resource_spec, 'observer'):
			app.spec.manifest[k8s_resource].observer = {
				'kind': 'default',
				'spec': {}
			}