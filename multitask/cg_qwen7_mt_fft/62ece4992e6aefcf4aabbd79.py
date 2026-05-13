def make_find_paths(find_paths):
	"""
	Given a sequence of path, transform all path into glob patterns. Pass through existing patterns untouched.

    Args:
        find_paths: sequence of path
    Returns:
        tuple of transformed path
	"""
	if not isinstance(find_paths, (list,tuple)):
		find_paths = [find_paths]

	return tuple(
		path if is_glob(path) else os.path.join('*',path,'**')
		for path in find_paths
	)