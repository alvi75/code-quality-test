def _explore_folder(folder):
	"""
	Groups files in the given group by using _group_files_by_xml_filename.
	"""
	for root, dirs, files in os.walk(folder):
		for f in files:
			file_path = os.path.join(root, f)
			if not file_path.endswith('.xml'):
				continue
			file_name = file_path[:-len('.xml')]
			yield (file_name, _group_files_by_xml_filename(file_path))