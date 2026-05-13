def files_list(path):
	"""
	Return the files in given path.
	"""
	return [f for f in os.listdir(path) if os.path.isfile(os.path.join(path, f))]