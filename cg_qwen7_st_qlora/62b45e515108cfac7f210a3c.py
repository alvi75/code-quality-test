def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""

	if os.path.exists(self.root_path) or self.storage_root_exists():
		raise Exception("Storage root already exists at {}".format(self.root_path))

	self._create_storage_root()
	self._write_manifest()