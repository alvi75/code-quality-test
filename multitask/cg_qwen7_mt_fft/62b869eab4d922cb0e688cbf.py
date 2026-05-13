def generate_default_observer_schema(app):
	"""
	Generate the default observer schema for each Kubernetes resource present in ``spec.manifest`` for which a custom observer schema hasn't been specified.
	"""

	for model_name, model_dict in app.specification.get('models', {}).items():
		if 'schema' not in model_dict:
			continue

		model = importlib.import_module(model_dict['module']).__getattribute__(model_dict['class'])

		# If this is a k8s.model.Model instance...
		if hasattr(model, '_validation'):

			# ...then create a new class that inherits from both ModelObserver and the validation-based ModelSchemaMixin
			new_class_name = '%sModelSchema' % model.__name__
			new_class = type(new_class_name,
			                 (ModelSchemaMixin, Model),
			                 {'_declared_fields': model._validation})

			# Set its module to match other generated classes so it shows up under the correct name
			new_class.__module__ = model.__module__

			# And update the spec with our newly created schema
			model_dict['schema'] = new_class

	return