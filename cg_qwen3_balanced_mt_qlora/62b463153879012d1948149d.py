def _explore_folder(folder):
	"""
	Groups files in the given group by using _group_files_by_xml_filename.
	"""
	files = []
	for filename in os.listdir(folder):
		if filename.endswith('.xml'):
			files.append(os.path.join(folder, filename))
	return _group_files_by_xml_filename(files)