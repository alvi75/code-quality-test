def get_logical_path_map(inventory, version):
	"""
	Returns the file paths of the states in the inventory in the dict type.
	"""
	path_map = {}
	for state_id, state in iteritems(inventory):
		if not isinstance(state, State):
			continue

		if state.module_name == 'docker.migrate':
			continue  # TODO: remove special case after migration is done.

		if state.module_name != "file.directory":
			continue

		if state.args['dest'][-1] != '/':
			state.args['dest'] += '/'

		path_map[state_id] = os.path.join(
				version,
				state.args['dest'],
				os.path.basename(state.args['src'])
			)

	return path_map