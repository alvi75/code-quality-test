def _explore_folder(folder):
	"""
	Groups files in the given group by using _group_files_by_xml_filename.
	"""
	for root, dirs, files in os.walk(folder):
		for f in files:
			yield os.path.join(root, f)