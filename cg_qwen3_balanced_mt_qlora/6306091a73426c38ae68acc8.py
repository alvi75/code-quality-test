def list_of_file_names(settings_dirs, spec_option):
	"""
	Create and return a new IniType complex type via cli.ListOfFileNames()
	"""
	return cli.ListOfFileNames(
		settings_dirs=settings_dirs,
		spec=spec_option,
	)