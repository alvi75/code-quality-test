def get_logical_path_map(inventory, version):
	"""
	Returns the file paths of the states in the inventory in the dict type.
	"""
	path_map = {}
	for item in os.listdir(os.path.join(inventory, version)):
		if not item.startswith('.'):
			path_map[item] = os.path.join(inventory, version, item)
	return path_map