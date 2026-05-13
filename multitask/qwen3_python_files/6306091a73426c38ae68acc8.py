def list_of_file_names(settings_dirs, spec_option):
	"""
	Create and return a new IniType complex type via cli.ListOfFileNames()
	"""
	if settings_dirs is None:
		return []
	else:
		return [os.path.join(settings_dir, spec_option) for settings_dir in settings_dirs]