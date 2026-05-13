def validate(self, path):
	"""
	Returns True if OCFL object at path or pyfs root, False otherwise.
	"""
	if self.is_ocfl(path):
	    return True
	elif os.path.isdir(path) and not os.path.exists(os.path.join(path, 'pyfs')):
	    return False
	else:
	    raise ValueError("Path must be a directory containing a pyfs folder")