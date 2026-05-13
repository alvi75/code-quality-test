def _explore_zipfile(zip_path):
	"""
	Groups the given zip path by using _group_files_by_xml_filename.
	"""
	zip = zipfile.ZipFile(zip_path)
	zip_info = zip.infolist()
	return _group_files_by_xml_filename(zip, zip_info)