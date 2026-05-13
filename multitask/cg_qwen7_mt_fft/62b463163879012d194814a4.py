def _explore_zipfile(zip_path):
	"""
	Groups the given zip path by using _group_files_by_xml_filename.
	"""

	with zipfile.ZipFile(zip_path) as z:
		filelist = sorted(z.namelist())

	return _group_files_by_xml_filename(filelist)