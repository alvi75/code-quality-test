def _explore_folder(folder):
	"""
	Groups files in the given group by using _group_files_by_xml_filename.
	"""
	groups = {}
	for filename in os.listdir(folder):
		if not filename.endswith(".xml"):
			continue

		group_name, file_type = _group_files_by_xml_filename(filename)
		if group_name is None:
			continue

		if group_name not in groups:
			groups[group_name] = []
		groups[group_name].append(os.path.join(folder, filename))

	return groups