def _explore_zipfile(zip_path):
	"""
	Groups the given zip path by using _group_files_by_xml_filename.
	"""
	with ZipFile(zip_path, 'r') as z:
		files = z.namelist()
	return _group_files_by_xml_filenames(files)