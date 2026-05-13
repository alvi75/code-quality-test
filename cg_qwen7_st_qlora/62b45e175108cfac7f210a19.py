def validate_fixity(self, fixity, manifest_files):
	"""
	Validate fixity block in inventory. Check the structure of the fixity block and makes sure that only files listed in the manifest are referenced. Return error() in the class.
	"""
	if not isinstance(fixity, dict) or 'fixity' not in fixity:
		self.errors.append(error('Fixity block is missing'))
	else:
		for f in fixity['fixity']:
			if f not in manifest_files:
				self.errors.append(error('File %s is referenced in fixity but not found in manifest' % f))