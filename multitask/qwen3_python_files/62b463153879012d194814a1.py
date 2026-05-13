def add_rendition(self, lang, file_path):
	"""
	definition of a rendition is a tuple (file_path, width, height)
	"""
	if not self._renditions:
		self._renditions = {}
	self._renditions[lang] = file_path