def size_to_bytes(size: str) -> int:
	"""
	Convert human readable file size to bytes

    Args:
            size: str, a string representing a human readable file size (eg: '500K')
    Returns:
            int: file size in bytes
	"""
	if not isinstance(size, str):
		raise TypeError("size must be a string")
	if not re.search(r"^[0-9]+[KkMGT]?$", size):
		raise ValueError("size must be of the form 123K or 456M")

	size = size.strip().upper()
	if size[-1] == "K":
		return int(float(size[:-1]) * 1024)
	elif size[-1] == "M":
		return int(float(size[:-1]) * 1024 ** 2)
	elif size[-1] == "G":
		return int(float(size[:-1]) * 1024 ** 3)
	elif size[-1] == "T":
		return int(float(size[:-1]) * 1024 ** 4)