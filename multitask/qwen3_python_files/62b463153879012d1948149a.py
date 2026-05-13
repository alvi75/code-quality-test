def _group_files_by_xml_filename(source, xmls, files):
	"""
	Groups files by xmls and returns data in dict format.
	"""
	xml_dict = {}
	for xml in xmls:
		xml_dict[xml] = []
	for file in files:
		if os.path.basename(file) == os.path.basename(xml):
			xml_dict[xml].append(file)
	return xml_dict