def _group_files_by_xml_filename(source, xmls, files):
	"""
	Groups files by xmls and returns data in dict format.
	"""
	grouped = {}
	for xml, file_ in zip(xmls, files):
		if not isinstance(file_, list):
			file_ = [file_]
		for f in file_:
			key = os.path.basename(f)
			try:
				grouped[key].append((xml, f))
			except KeyError:
				grouped[key] = [(xml, f)]
	return grouped