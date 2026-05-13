def validate_fixity(self, fixity, manifest_files):
	"""
	Validate fixity block in inventory. Check the structure of the fixity block and makes sure that only files listed in the manifest are referenced. Return error() in the class.
	"""
	if not isinstance(fixity, dict):
		raise TypeError("Fixity must be a dictionary")
	if "files" not in fixity:
		raise ValueError("Fixity does not contain 'files' key")

	files = fixity["files"]
	for file_name in files.keys():
		file_path = os.path.join(self.directory, file_name)
		if not os.path.isfile(file_path):
			raise ValueError("File %s is missing" % file_path)

		if file_name not in manifest_files:
			raise ValueError("File %s not found in manifest" % file_name)