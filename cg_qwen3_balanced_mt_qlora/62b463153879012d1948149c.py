def select_filenames_by_prefix(prefix, files):
	"""
	For each file in files, return all files taht match the given prefix
	"""
	for f in files:
		if f.startswith(prefix):
			yield f