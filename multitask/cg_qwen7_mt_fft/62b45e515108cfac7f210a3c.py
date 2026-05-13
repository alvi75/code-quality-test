def initialize(self):
	"""
	Create and initialize a new OCFL storage root.
	"""
	if self.exists:
	    raise FileExistsError(str(self))
	self.mkdir()
	self.touch()