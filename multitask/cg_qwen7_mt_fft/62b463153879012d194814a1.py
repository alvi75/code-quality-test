def add_rendition(self, lang, file_path):
	"""
	Assign the filepath invoke by filepath() in the class to "lang" in _renditions in the class.
	"""
	if not self.master:
			raise Exception("Can't create rendition without master.")
	if os.path.isfile(file_path):
			self._renditions[lang] = file_path
	else:
			raise IOError('File %s does not exist' % (file_path))