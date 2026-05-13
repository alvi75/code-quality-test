def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	self._initialize()
	self._storage = StorageRoot(self)
	self._storage.initialize()