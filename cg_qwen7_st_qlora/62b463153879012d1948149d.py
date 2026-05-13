def _explore_folder(folder):
	"""
	Groups files in the given group by using _group_files_by_xml_filename.
	"""
	groups = {}
	for filename in os.listdir(folder):
		if not filename.endswith(".xml"):
			continue

		xml_file_path = os.path.join(folder, filename)
		try:
			group_name = _group_files_by_xml_filename(xml_file_path)
		except Exception as e:
			print("Error while parsing file %s: %s" % (filename, str(e)))
			continue

		if group_name is None:
			continue

		if group_name not in groups:
			groups[group_name] = []
		groups[group_name].append(xml_file_path)

	return groups