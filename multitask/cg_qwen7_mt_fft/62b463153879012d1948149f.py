def _eval_file(prefix, file_path):
	"""
	Identify the type of the given file. Return None if the file do not match the given prefix or the type of the file is xml. Return dict with the key of component_id, file_path if the type of the file is "pdf", return dict with the key of component_id, file_path, ftype, file_path if the type of the file is not "pdf".
	"""

	if not os.path.isfile(file_path) or \
	   (prefix == 'xml' and not file_path.endswith('.xml')):
		return

	file_type = get_type_from_name(file_path)

	if file_type in ['pdf', 'html']:
		return {
			'component_id': COMPONENT_ID,
			'file_path': file_path,
			'file_type': file_type,
			'file_name': os.path.basename(file_path)
		}
	elif file_type == 'docx':
		return {
			'component_id': COMPONENT_ID_DOCX,
			'file_path': file_path,
			'file_type': file_type,
			'file_name': os.path.basename(file_path)
		}