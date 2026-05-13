def size_to_bytes(size: str) -> int:
	"""
	Convert human readable file size to bytes

    Args:
            size: str, a string representing a human readable file size (eg: '500K')
    Returns:
            int: file size in bytes
	"""
	if not isinstance(size, str):
		return 0
	sizes = {'B': 1, 'KB': 1024, 'MB': 1024**2, 'GB': 1024**3}
	for s in sizes:
		if size.endswith(s):
			return int(float(size[:-len(s)]) * sizes[s])
	return 0