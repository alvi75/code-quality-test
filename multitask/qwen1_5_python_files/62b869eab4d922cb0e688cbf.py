def generate_default_observer_schema(app):
		"""
		Generate the default observer schema for each Kubernetes resource present in ``spec.manifest`` for which a custom observer schema hasn't been specified.
		"""
		for k8s_object_type, k8s_objects in app.spec.k8s_objects.items():
			if k8s_object_type not in OBSERVER_SCHEMA_REGISTRY:
				# TODO: Add support for generating schemas for other k8s API objects (e.g., CustomResourceDefinition)
				raise NotImplementedError("Observer schema generation is not supported for {} objects".format(k8s_object_type))

			for k8s_object in k8s_objects:
				observer_schema = OBSERVER_SCHEMA_REGISTRY[k8s_object_type].copy()
				# Add additional fields to the generated schema that are specific to this particular object type
				additional_fields = {
					"apiVersion": k8s_object.api_version,
					"kind": k8s_object.kind,
					"name": k8s_object.metadata.name,
					"namespace": k8s_object.metadata.namespace,
					"resourceVersion": k8s_object.metadata.resourceVersion,
					"selfLink": k8s_object.self_link,
					"uid": k8s_object.metadata.uid,
					"creationTimestamp": k8s_object.metadata.creationTime,
					"deletionTimestamp": k8s_object.metadata.deletionTime,
					"status": k8s_object.status,
					"annotations": k8s_object.annotations,
					"labels": k8s_object.labels,
					"managedFields": k8s_object.managedFields,
					"finalizers": k8s_object.finalizers,
					"forbiddenStatus": k8s_object.forbiddenStatus,
					"phase": k8s_object.phase,
					"resourceVersion": k8s_object.resourceVersion,
					"generation": k8s_object.generation,
					"ownerReferences": k8s_object.ownerReferences,
					"references": k8s_object.references,
					"firstCreationTime": k8s_object.firstCreationTime,
					"lastDesiredState": k8s_object.lastDesiredState,
					"lastKnownState": k8s_object.lastKnownState,
					"conditions": k8s_object.conditions,
					"statuses": k8s_object.statuses,
					"events": k8s_object.events,
					"