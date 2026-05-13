def validate(self, path):
	"""
	Returns True if OCFL object at path or pyfs root, False otherwise.
	"""
	if self._is_valid(path) is not None:
		return self._is_valid(path)
	elif os.path.exists(path):
		return True
	else:
		return False