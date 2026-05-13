def get_logical_path_map(inventory, version):
	"""
	Returns the file paths of the states in the inventory in the dict type.
	"""
	lpm = {}
	for item in inventory:
		if isinstance(item, six.string_types) or hasattr(item, 'path'):
			item = __salt__['cp.cache_file'](item)
		elif not isinstance(item, six.string_types):
			raise TypeError('Inventory contains a non-string object: {0}'.format(item))
		lpm[item] = os.path.realpath(item)

	return lpm