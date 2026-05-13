def generate_default_observer_schema(app):
	"""
	Generate the default observer schema for each Kubernetes resource present in ``spec.manifest`` for which a custom observer schema hasn't been specified.
	"""
	for manifest in app.spec.manifest:
		if not manifest.observers:
			continue

		for observer in manifest.observers:
			if observer.schema is None:
				continue

			yield observer.schema