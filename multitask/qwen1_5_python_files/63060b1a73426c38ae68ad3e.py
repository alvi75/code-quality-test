def get_plugin_spec_flatten_dict(plugin_dir):
	"""
	Use YAML to read various information in plugin_dir and return the information in dictionary form.
	"""
	spec = {}
	for root, dirs, files in os.walk(plugin_dir):
		if not dirs:
			dir_name = os.path.basename(root)
			if dir_name.startswith('_'):
				continue
			spec[dir_name] = {}
			for f in files:
				file_name = os.path.splitext(f)[0]
				if file_name == 'plugin':
					with open(os.path.join(root, f), 'r') as fp:
						try:
							spec[dir_name][file_name] = yaml.load(fp.read())
						except Exception as e:
							raise PluginSpecError('Failed to parse %s/%s: %s' % (dir_name, file_name, str(e)))
	return spec