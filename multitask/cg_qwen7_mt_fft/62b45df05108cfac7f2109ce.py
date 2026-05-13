def validate(self, path):
	"""
	Returns True if OCFL object at path or pyfs root, False otherwise.
	"""
	if self.fs.exists(path):
			return True

	try:
		self._validate(path)
	except Exception as e:
		print(e)

	return False