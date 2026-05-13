def strip_root(path, root):
	"""
	Remove root from path. If fails, throw exception

    Returns:
        A path without root
	"""
	if not path.startswith(root):
		raise ValueError("Path %s does not start with root %s" % (path, root))
	return path[len(root):]