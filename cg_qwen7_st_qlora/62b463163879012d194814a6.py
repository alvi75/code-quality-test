def files_list_from_zipfile(zip_path):
	"""
	Return the files in the given zip path.
	"""
	with zipfile.ZipFile(zip_path, 'r') as z:
		return [f for f in z.namelist() if not f.endswith('/')]