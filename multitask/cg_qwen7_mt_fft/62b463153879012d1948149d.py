def _explore_folder(folder):
	"""
	Groups files in the given group by using _group_files_by_xml_filename.
	"""
	groups = {}
	for filename, file_content in _get_files_in_folder(folder).items():
		if not isinstance(file_content, dict) or "XML" not in list(file_content.keys()):
			continue

		parsed_data = xmltodict.parse(file_content["XML"])
		root_key = next(iter(parsed_data))
		if root_key not in groups:
			groups[root_key] = {}

		groups[root_key][filename] = parsed_data[root_key]

	return groups