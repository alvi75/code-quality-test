def files_list(path):
	"""
	Return the files in given path.
	"""
	files = []
	for root, dirs, filenames in os.walk(path):
		for filename in filenames:
			files.append(os.path.join(root, filename))
	return files