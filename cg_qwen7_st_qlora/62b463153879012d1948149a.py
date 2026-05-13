def _group_files_by_xml_filename(source, xmls, files):
	"""
	Groups files by xmls and returns data in dict format.
	"""

	grouped = {}
	for f in files:
		xml_name = os.path.basename(f).split('.')[0]
		if xml_name not in grouped.keys():
			grouped[xml_name] = []
		grouped[xml_name].append(os.path.join(source,f))

	return grouped