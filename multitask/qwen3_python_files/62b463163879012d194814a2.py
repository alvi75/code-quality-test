def add_asset(self, basename, file_path):
	"""
	def add_asset(self, basename, file_path):
	"""
	Assign the filepath invoke by filepath() in the class to "basename" in _assets in the class.
	"""
	self._assets[basename] = self.filepath(file_path)