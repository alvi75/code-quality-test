def get_plugin_spec_flatten_dict(plugin_dir):
	"""
	Use YAML to read various information in plugin_dir and return the information in dictionary form.
	"""
	flatten = {}
	for (dirpath, dirnames, filenames) in os.walk(plugin_dir):
		if "plugin.yaml" not in filenames:
			continue

		dir_split = dirpath.split(os.sep)
		name = "-".join(dir_split[len(plugin_dir.split(os.sep)) + 1:])

		with open(os.path.join(dirpath, "plugin.yaml")) as f:
			spec = yaml.safe_load(f)

		for key in spec.keys():
			flatten["{}-{}".format(name, key)] = spec[key]

	return flatten