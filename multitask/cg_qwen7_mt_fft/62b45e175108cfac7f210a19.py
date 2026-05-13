def validate_fixity(self, fixity, manifest_files):
		'''
		Validate fixity block in inventory. Check the structure of the fixity block and makes sure that only files listed in the manifest are referenced. Return error() in the class.

		'''

		if not isinstance(fixity, dict) or len(fixity.keys()) != 1:
			self.add_error("Fixity section should be a dictionary with one key")
			return

		fix_type = list(fixity.keys())[0]
		if fix_type not in self.fix_types:
			self.add_error("Invalid fixity type: %s" %fix_type)
			return

		fix_data = fixity[fix_type]

		if "format" not in fix_data or \
		   (isinstance(fix_data["format"],str) and fix_data["format"] not in ["csv","xml"]):
			self.add_error('Fixity format must be either "csv" or "xml".')
			return

		if "files" not in fix_data:
			self.add_error("Missing file listing for fixity.")
			return

		if not isinstance(fix_data["files"],list):
			self.add_error("File listing is not formatted as a list.")
			return

		for f in fix_data["files"]:
			if not os.path.isfile(os.path.join(self.manifest_root,f)):
				self.add_error("File '%s' specified in fixity but not found in the archive." %f)

		return