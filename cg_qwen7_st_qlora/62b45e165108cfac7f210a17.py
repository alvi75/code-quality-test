def get_logical_path_map(inventory, version):
	"""
	Returns the file paths of the states in the inventory in the dict type.
	"""

	logical_path_map = {}
	for state_name, state in inventory.states.items():
		if state.version == version:
			logical_path_map[state.name] = state.logical_path

	return logical_path_map