def get_plugin_spec_flatten_dict(plugin_dir):
	"""
	Use YAML to read various information in plugin_dir and return the information in dictionary form.
	"""
	specs = {}
	for root, dirs, files in os.walk(plugin_dir):
		for f in files:
			if not f.endswith('.yaml'):
				continue
			spec_path = os.path.join(root, f)
			with open(spec_path) as spec_file:
				specs[f] = yaml.safe_load(spec_file.read())
	return specs