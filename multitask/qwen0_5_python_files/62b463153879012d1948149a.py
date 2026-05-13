def _group_files_by_xml_filename(source, xmls, files):
	"""
	Groups files by xmls and returns data in dict format.
	"""
	grouped = {}
	for xml_file in xmls:
		if xml_file not in grouped:
			grouped[xml_file] = []
		grouped[xml_file].append(files[xml_file])
	return grouped