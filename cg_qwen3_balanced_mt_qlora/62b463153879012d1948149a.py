def _group_files_by_xml_filename(source, xmls, files):
	"""
	Groups files by xmls and returns data in dict format.
	"""
	return {xml: [f for f in files if f.endswith(xml)] for xml in xmls}