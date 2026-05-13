def files_list_from_zipfile(zip_path):
	"""
	Return the files in the given zip path.
	"""
	with zipfile.ZipFile(zip_path) as z:
		return [z.namelist()[i] for i in range(len(z.namelist()))]