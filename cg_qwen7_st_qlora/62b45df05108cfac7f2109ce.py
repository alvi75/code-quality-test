def validate(self, path):
	"""
	Returns True if OCFL object at path or pyfs root, False otherwise.
	"""
	if not self.is_ocfl(path):
		return False

	try:
		self._validate(path)
	except Exception as e:
		raise OCFLError(e)

	return True