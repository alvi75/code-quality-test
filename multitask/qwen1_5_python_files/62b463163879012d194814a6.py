def files_list_from_zipfile(zip_path):
	"""
	Return the files in the given zip path.
	"""
	files = []
	with ZipFile(zip_path) as z:
		for f in z.namelist():
			if not f.endswith('/'):
				files.append(f)
	return files