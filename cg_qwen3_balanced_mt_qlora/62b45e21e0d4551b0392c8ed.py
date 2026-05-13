def find_path_type(path):
	"""
	Return a string indicating the type of thing at the given path
	"""
	if os.path.isdir(path):
		return 'dir'
	elif os.path.isfile(path):
		return 'file'
	else:
		return 'unknown'