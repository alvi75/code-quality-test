def size_to_bytes(size: str) -> int:
	"""
	Convert human readable file size to bytes

    Args:
            size: str, a string representing a human readable file size (eg: '500K')
    Returns:
            int: file size in bytes
	"""

	size = size.upper()
	if size.endswith('B'):
		return int(size[:-1])
	elif size.endswith('KB'):
		return int(size[:-2]) * 1024
	elif size.endswith('MB'):
		return int(size[:-2]) * 1024 ** 2
	elif size.endswith('GB'):
		return int(size[:-2]) * 1024 ** 3
	else:
		raise ValueError("Invalid size format")