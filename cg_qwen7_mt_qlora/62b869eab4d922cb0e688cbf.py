def generate_default_observer_schema(app):
	"""
	Generate the default observer schema for each Kubernetes resource present in ``spec.manifest`` for which a custom observer schema hasn't been specified.
	"""

	for resource_name, resource_spec in app.spec.manifest.items():
		if not hasattr(resource_spec, 'observer'):
			resource = get_kubernetes_resource(resource_name)
			resource_schema = resource.get_schema()
			app.spec.manifest[resource_name].observer = resource_schema