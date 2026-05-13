def add_asset(self, basename, file_path):
	"""
	Assign the filepath invoke by filepath() in the class to "basename" in _assets in the class.
	"""
	if not os.path.isfile(file_path):
	    raise IOError("File does not exist: %s" % (file_path))
	self._assets[basename] = file_path