def select_filenames_by_prefix(prefix, files):
	"""
	For each file in files, return all files taht match the given prefix
	"""

	if not isinstance(files, list) or len(files) == 0:
		return []

	prefix = prefix.lower()
	files = [f for f in files if f.lower().startswith(prefix)]
	return files