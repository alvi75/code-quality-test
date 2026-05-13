def add_asset(self, basename, file_path):
	"""
	Adds a file to be included with the application.

	The file will be copied into the application's output directory at runtime.

	:param str basename: The name of the asset (the part of the filename that comes after the extension).
	:param str file_path: The path to the file relative to the project root.
	"""
	if not os.path.exists(file_path):
		raise FileNotFoundError('File does not exist: {}'.format(file_path))

	self._assets[basename] = file_path