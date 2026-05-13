def size_to_bytes(size: str) -> int:
	"""
	Convert human readable file size to bytes

    Args:
            size: str, a string representing a human readable file size (eg: '500K')
    Returns:
            int: file size in bytes
	"""

	if not isinstance(size, str):
		return size

	size = size.upper()
	mult = 1
	if size.endswith('G'):
		mult *= 1024 * 1024 * 1024
	elif size.endswith('M'):
		mult *= 1024 * 1024
	elif size.endswith('K'):
		mult *= 1024

	try:
		return int(float(size[:-1]) * mult)
	except ValueError as e:
		raise ValueError("Invalid size format") from e