def validate(self, path):
	"""
	Returns True if OCFL object at path or pyfs root, False otherwise.
	"""
	if not os.path.exists(path):
		return False

	if self._validate_path(path):
		return True

	for root, dirs, files in os.walk(path):
		if self._validate_path(root):
			return True

	return False