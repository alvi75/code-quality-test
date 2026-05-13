def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	if self.root.exists():
		raise ValueError("Storage root already exists")

	self.root.mkdir()
	self._initialize_storage_root()