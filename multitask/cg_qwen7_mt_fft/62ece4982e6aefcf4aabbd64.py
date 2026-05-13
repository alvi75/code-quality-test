def strip_root(path, root):
	"""
	Remove root from path. If fails, throw exception

    Returns:
        A path without root
	"""
	if not isinstance(root, Path):
		root = PurePath(root)

	if not is_prefix_path(path, root):
		raise ValueError("{} does not start with {}".format(path, root))

	return path[len(root):]