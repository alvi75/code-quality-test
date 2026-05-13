def find_path_type(path):
	"""
	Return a string indicating the type of thing at the given path
	"""
	if os.path.isdir(path):
		return "directory"
	elif os.path.isfile(path):
		return "file"
	else:
		raise ValueError("Unknown file or directory: %s" % path)