def files_list(path):
	"""
	Return the files in given path.
	"""
	files = []
	for root, dirs, files in os.walk(path):
		for f in files:
			files.append(os.path.join(root, f))
	return files