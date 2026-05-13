def select_filenames_by_prefix(prefix, files):
	"""
	def select_filenames_by_prefix(prefix, files)
	"""
	return [f for f in files if os.path.basename(f).startswith(prefix)]