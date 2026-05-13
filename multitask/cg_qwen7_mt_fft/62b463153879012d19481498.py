def files_list(path):
	"""
	Return the files in given path.
	"""
	dir_path = os.path.join(os.getcwd(), path)
	return [os.path.join(dir_path, f) for f in os.listdir(dir_path)]