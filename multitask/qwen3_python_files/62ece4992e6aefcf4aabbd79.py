def make_find_paths(find_paths):
	"""
	Given a sequence of path, transform all path into glob patterns. Pass through existing patterns untouched.

    Args:
        find_paths: sequence of path
    Returns:
        tuple of transformed path
	"""
	if not isinstance(find_paths, (list, tuple)):
		find_paths = [find_paths]
	return tuple(
		pattern if is_pattern(pattern) else pattern.replace(os.path.sep, '*')
		for pattern in find_paths
	)