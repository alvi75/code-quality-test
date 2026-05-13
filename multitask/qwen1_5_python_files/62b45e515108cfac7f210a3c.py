def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	if not self.exists():
		self._init_storage()
		self._init_metadata()