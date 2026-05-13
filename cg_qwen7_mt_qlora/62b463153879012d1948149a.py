def _group_files_by_xml_filename(source, xmls, files):
	"""
	Groups files by xmls and returns data in dict format.
	"""

	xml_dict = {}
	for f in files:
		if not os.path.exists(f):
			continue

		try:
			with open(f) as fp:
				tree = etree.parse(fp)
		except Exception as e:
			print("Error parsing file: %s" % (f))
			raise e

		root = tree.getroot()
		xml_name = root.find('filename').text
		if xml_name is None or xml_name == "":
			continue

		if xml_name not in xml_dict.keys():
			xml_dict[xml_name] = []

		xml_dict[xml_name].append(f)

	return xml_dict