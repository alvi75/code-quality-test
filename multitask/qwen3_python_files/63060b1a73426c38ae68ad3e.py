def get_plugin_spec_flatten_dict(plugin_dir):
	"""
	Use YAML to read various information in plugin_dir and return the information in dictionary form.
	"""
	spec = {}
	spec['name'] = os.path.basename(plugin_dir)
	spec['description'] = ''
	spec['version'] = '0.1'
	spec['author'] = ''
	spec['author_email'] = ''
	spec['license'] = ''
	spec['url'] = ''
	spec['download_url'] = ''
	spec['classifiers'] = []
	spec['keywords'] = []
	spec['packages'] = []
	spec['entry_points'] = []
	spec['install_requires'] = []
	spec['tests_require'] = []
	spec['cmdclass'] = []
	spec['package_data'] = {}
	spec['data_files'] = []
	spec['zip_safe'] = False
	spec['console_scripts'] = []
	spec['gui_scripts'] = []
	spec['include_package_data'] = True
	spec['long_description'] = ''

	# Read the spec file
	spec_file = os.path.join(plugin_dir, 'spec.yml')
	if not os.path.exists(spec_file):
		return None

	with open(spec_file) as f:
		spec = yaml.load(f)

	# Add the name of the plugin directory to the package data
	spec['package_data']['{0}.*'.format(spec['name'])] = ['*']

	# Add the name of the plugin directory to the entry points
	spec['entry_points']['{0} = {0}'.format(spec['name'])] = spec['name']

	# Add the name of the plugin directory to the install requires
	spec['install_requires'].append(spec['name'])

	# Add the name of the plugin directory to the tests requires
	spec['tests_require'].append(spec['name'])

	# Add the name of the plugin directory to the console scripts
	spec['console_scripts'].append(spec['name'])

	# Add the name of the plugin directory to the gui scripts
	spec['gui_scripts'].append(spec['name'])

	# Add the name of the plugin directory to the data files
	spec['data_files'].append(('share/{0}'.format(spec['name']), [os.path.join(plugin_dir, '*.py')]))

	# Return the spec dictionary
	return spec