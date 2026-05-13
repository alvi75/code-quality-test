def _eval_file(prefix, file_path):
	"""
	def _eval_file(prefix, file_path):
	"""
	if os.path.isfile(file_path) and len(file_path.split(os.path.sep)) > 1:
		file_name = os.path.basename(file_path)
		file_prefix = file_name.split('_')[0]
		if file_prefix == prefix:
			file_type = 'pdf'
			return {prefix:file_path}
		elif file_prefix == prefix + '_xml':
			file_type = 'xml'
			return {prefix:file_path}
		else:
			return None
	else:
		return None