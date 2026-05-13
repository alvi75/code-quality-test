def generate_default_observer_schema(app):
	"""
	Generate the default observer schema for each Kubernetes resource present in ``spec.manifest`` for which a custom observer schema hasn't been specified.
	"""
	for resource in app.spec.manifest:
		if not hasattr(resource, 'observer_schema'):
			resource.observer_schema = {
				"properties": {},
				"type": "object",
				"description": "The schema of the resource."
			}