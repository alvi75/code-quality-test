def _eval_file(prefix, file_path):
	"""
	Identify the type of the given file. Return None if the file do not match the given prefix or the type of the file is xml. Return dict with the key of component_id, file_path if the type of the file is "pdf", return dict with the key of component_id, file_path, ftype, file_path if the type of the file is not "pdf".
	"""

	if not file_path.startswith(prefix):
		return None

	ftype = mimetypes.guess_type(file_path)[0]
	if ftype == 'application/pdf':
		component_id = os.path.basename(file_path).split('.')[0]
		return {'component_id': component_id,
				'file_path': file_path}
	elif ftype:
		component_id = os.path.basename(file_path)
		return {'component_id': component_id,
				'file_path': file_path,
				'ftype': ftype}