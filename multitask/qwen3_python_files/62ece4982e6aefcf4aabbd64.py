def strip_root(path, root):
	"""
	Remove root from path. If fails, throw exception

    Returns:
        A path without root
	"""
	if not os.path.abspath(os.path.join(root, '')) == os.path.abspath(root):
		raise ValueError('root must be a directory')
	if not os.path.abspath(os.path.join(root, path)) == os.path.abspath(path):
		raise ValueError('path must be relative to root')
	return path[len(root) + 1:]