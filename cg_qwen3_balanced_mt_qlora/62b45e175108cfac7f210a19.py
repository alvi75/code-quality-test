def validate_fixity(self, fixity, manifest_files):
		"""
		Validate fixity block in inventory. Check the structure of the fixity block and makes sure that only files listed in the manifest are referenced. Return error() in the class.
		"""
		if not isinstance(fixity, dict):
			return self.error("Fixity must be a dictionary.")
		if 'files' not in fixity:
			return self.error("Fixity must contain a list of files.")
		for file in fixity['files']:
			if 'path' not in file:
				return self.error("File must have a path.")
			if 'checksum' not in file:
				return self.error("File must have a checksum.")
			if file['path'] not in manifest_files:
				return self.error("File %s is not in the manifest." % file['path'])