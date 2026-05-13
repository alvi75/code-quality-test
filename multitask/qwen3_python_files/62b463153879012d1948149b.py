def match_file_by_prefix(prefix, file_path):
	"""
	Given a filepath, return true if the basename of the filepath is startswith the given prefix plus "-" or the given prefix plus "." 
	"""
	file_name = os.path.basename(file_path)
	if not file_name:
		return False

	prefix_len = len(prefix)
	if (file_name.startswith(prefix + "-") or file_name.startswith(prefix + ".")) and len(file_name) > prefix_len + 1:
		return True
	else:
		return False