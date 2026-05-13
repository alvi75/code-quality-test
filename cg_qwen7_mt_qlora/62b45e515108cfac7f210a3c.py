def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	self._ensure_dir_exists()
	self._write_manifest()
	self._write_inventory()