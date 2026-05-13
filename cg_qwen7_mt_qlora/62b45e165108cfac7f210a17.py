def get_logical_path_map(inventory, version):
	"""
	Returns the file paths of the states in the inventory in the dict type.
	"""

	logical_path_map = {}
	for state in inventory:
		if not isinstance(state, State):
			continue

		state_name = state.name
		if state_name.startswith('v' + str(version) + '.'):
			logical_path_map[state_name] = state.path

	return logical_path_map