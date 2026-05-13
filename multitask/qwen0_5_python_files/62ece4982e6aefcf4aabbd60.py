def size_to_bytes(size: str) -> int:
	"""
	Convert human readable file size to bytes

    Args:
            size: str, a string representing a human readable file size (eg: '500K')
    Returns:
            int: file size in bytes
	"""
	if not size or len(size) == 0:
		return 0
	size = re.sub(r'[^0-9a-zA-Z]+', '', size)
	if size.endswith('K'):
		size *= 1024
	elif size.endswith('M'):
		size *= 1024 * 1024
	elif size.endswith('G'):
		size *= 1024 * 1024 * 1024
	else:
		raise ValueError("Unknown unit in path specification")
	return int(float(size))