def validate_fixity(self, fixity, manifest_files):
	"""
	Validate fixity block in inventory. Check the structure of the fixity block and makes sure that only files listed in the manifest are referenced. Return error() in the class.
	"""

	if not isinstance(fixity, dict) or 'algorithm' not in fixity:
		self.error('Fixity block is missing algorithm')
		return False

	if fixity['algorithm'] != self.algorithm:
		self.error('Fixity algorithm does not match')
		return False

	for file in fixity.get('files', []):
		if file not in manifest_files:
			self.error('File %s is not in manifest' % file)
			return False

	return True