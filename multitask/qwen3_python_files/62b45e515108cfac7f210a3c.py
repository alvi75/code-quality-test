def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	self._create_root_dir()
	self._create_storage_dirs()
	self._create_metadata()