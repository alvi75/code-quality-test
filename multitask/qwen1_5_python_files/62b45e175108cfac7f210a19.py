def validate_fixity(self, fixity, manifest_files):
		""" Validate fixity block in inventory. Check the structure of the fixity block and makes sure that only files listed in the manifest are referenced. Return error() in the class.
		"""
		if not isinstance(fixity, dict) or 'files' not in fixity:
			return self.error('Invalid fixity block')

		for filename, filehash in fixity['files'].items():
			if filename not in manifest_files:
				self.logger.debug("File %s is missing from manifest", filename)
				return self.error("%s: File not found" % (filename))

			elif manifest_files[filename] != filehash:
				self.logger.debug("Hash for %s has changed!", filename)
				return self.error("%s: Hash mismatch" % (filename))