def files_list_from_zipfile(zip_path):
	"""
	Return the files in the given zip path.
	"""
	z = zipfile.ZipFile(zip_path)
	return [zinfo.filename for zinfo in z.infolist()]