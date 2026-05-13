def add_asset(self, basename, file_path):
	"""
	Assign the filepath invoke by filepath() in the class to "basename" in _assets in the class.
	"""
	if not self._assets:
		self._assets = {}
	self._assets[basename] = file_path