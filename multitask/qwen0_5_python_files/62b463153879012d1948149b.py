def match_file_by_prefix(prefix, file_path):
	"""
	Given a filepath, return true if the basename of the filepath is startswith the given prefix plus "-" or the given prefix plus "."
	"""
	if not os.path.exists(file_path):
		return False

	file_basename = os.path.basename(file_path)
	if len(file_basename) == 0:
		return False

	if file_basename.startswith(prefix + "-"):
		return True
	elif file_basename.startswith(prefix + "."):
		return True
	else:
		return False