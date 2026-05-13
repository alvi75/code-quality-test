def list_of_file_names(settings_dirs, spec_option):
	"""
	Create and return a new IniType complex type via cli.ListOfFileNames()
	"""
	return cli.ListOfFileNames(
		name="settings",
		description="The settings files to use.",
		type=cli.FileNameList(),
		directory=settings_dirs,
		option=spec_option)