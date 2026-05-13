def strip_root(path, root):
	"""
	Remove root from path. If fails, throw exception

    Returns:
        A path without root
	"""
	if not os.path.isabs(path):
		raise ValueError("Path must be absolute")
	if not os.path.commonprefix([path, root]):
		return path
	return os.path.relpath(path, root)