def strip_root(path, root):
	"""
	Remove a root from a path if it exists.

    Args:
        path (str): Path to strip.
        root (str): Root to remove.

    Raises:
        ValueError: If path does not start with root.

    Returns:
        str: Path without root.
	"""
	if not os.path.abspath(root):
		raise ValueError("Invalid root argument %s" % root)
	if not os.path.isabs(path):
		raise ValueError("Path is not absolute")
	if path == root:
		return ""
	elif path.startswith(root):
		return path[len(root):]
	else:
		raise ValueError("Path does not begin with root")