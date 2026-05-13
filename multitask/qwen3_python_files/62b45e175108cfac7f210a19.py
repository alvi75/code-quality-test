def validate_fixity(self, fixity, manifest_files):
	"""
	def validate_fixity(self, fixity, manifest_files):
	"""
	Validate fixity block in inventory. Check the structure of the fixity block and makes sure that only files listed in the manifest are referenced. Return error() in the class.
	"""
	if not isinstance(fixity, dict):
		self.error("Fixity block is not a dictionary")
		return

	if 'hashes' not in fixity:
		self.error("Fixity block has no hashes")
		return

	if not isinstance(fixity['hashes'], list):
		self.error("Fixity block hash list is not a list")
		return

	for h in fixity['hashes']:
		if not isinstance(h, dict):
			self.error("Hash entry is not a dictionary")
			return

		if 'algorithm' not in h:
			self.error("Hash entry has no algorithm")
			return

		if 'checksum' not in h:
			self.error("Hash entry has no checksum")
			return

		if 'filename' not in h:
			self.error("Hash entry has no filename")
			return

		if h['filename'] not in manifest_files:
			self.error("Hash entry filename does not match any file in manifest")
			return

		if h['algorithm'] not in self.hashers:
			self.error("Hash entry algorithm %s is not supported" % (h['algorithm']))
			return

		if h['checksum'] != self.hashers[h['algorithm']].checksum(manifest_files[h['filename']], h['filename']):
			self.error("Hash entry checksum does not match actual file %s" % (h['filename']))
			return

		if 'size' in h:
			if h['size'] != os.path.getsize(manifest_files[h['filename']]):
				self.error("Hash entry size does not match actual file %s" % (h['filename']))
				return

		if 'modified' in h:
			if h['modified'] != datetime.utcfromtimestamp(os.path.getmtime(manifest_files[h['filename']])):
				self.error("Hash entry modified does not match actual file %s" % (h['filename']))
				return

		if 'created' in h:
			if h['created'] != datetime.utcfromtimestamp(os.path.getctime(manifest_files[h['filename']])):
				self.error("Hash entry created does not match actual file %s" % (h['filename']))