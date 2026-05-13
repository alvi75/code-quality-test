def _group_files_by_xml_filename(source, xmls, files):
	"""
	Groups files by xmls and returns data in dict format.
	"""

	data = {}

	for file_ in files:
		if not os.path.isfile(os.path.join(source, file_)):
			continue

		parts = file_.split('.')
		part_num = parts[-1]

		if part_num == '0':
			file_name = '.'.join(parts[:-1])
			data[file_name] = {}
			data[file_name]['parts'] = []

		data[file_name]['parts'].append({
			'part_num': int(part_num),
			'filename': file_,
			'xml_path': xmls.get(file_)
		})

	return data