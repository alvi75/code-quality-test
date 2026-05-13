def get_plugin_spec_flatten_dict(plugin_dir):
	"""
	Use YAML to read various information in plugin_dir and return the information in dictionary form.
	"""

	dict = {}
	for filename in os.listdir(plugin_dir):
		if not filename.endswith(".yml"):
			continue

		filepath = os.path.join(plugin_dir, filename)
		with open(filepath) as f:
			data = yaml.load(f)

		for key, value in data.items():
			dict[key] = value

	return dict