def find_path_type(path):
	"""
	Return a string indicating the type of thing at the given path
	"""
	if not isinstance(path, str):
		raise TypeError("path should be a string")
	path = norm_slashes(path)
	if is_storage(path) or is_ssh_url(path):
		return "remote"
	elif os.path.exists(path):
		if os.path.isdir(path):
			return "dir"
		else:
			return "file"
	else:
		return None