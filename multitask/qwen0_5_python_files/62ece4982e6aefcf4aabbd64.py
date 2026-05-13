def strip_root(path, root):
	"""
	Remove root from path. If fails, throw exception

    Returns:
        A path without root
	"""
	try:
		return os.path.normpath(os.path.join(root, path))
	except OSError as e:
		if e.errno == errno.ENOTDIR:
			raise ValueError("Path is not a directory: %s" % path)
		else:
			raise