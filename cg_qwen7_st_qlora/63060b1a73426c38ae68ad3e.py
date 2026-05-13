def get_plugin_spec_flatten_dict(plugin_dir):
	"""
	Use YAML to read various information in plugin_dir and return the information in dictionary form.
	"""
	spec_file = os.path.join(plugin_dir, 'spec.yaml')
	if not os.path.exists(spec_file):
		raise Exception('Plugin spec file does not exist: %s' % spec_file)
	with open(spec_file) as f:
		spec_yaml = yaml.load(f.read())
	return flatten_dict(spec_yaml)