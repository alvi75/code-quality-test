def find_path_type(path):
	"""
	Return a string indicating the type of thing at the given path
	"""
	if os.path.isfile(path):
		return 'file'
	elif os.path.isdir(path):
		return 'dir'
	elif os.path.islink(path):
		return 'link'
	else:
		raise ValueError('Path %s is not a file, directory or link' % path)