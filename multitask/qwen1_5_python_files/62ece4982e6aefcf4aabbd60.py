def size_to_bytes(size: str) -> int:
    """
    Convert human readable file size to bytes

    Args:
            size: str, a string representing a human readable file size (eg: '500K')
    Returns:
            int: file size in bytes
	"""
    if not size:
        return 0
    try:
        s = re.search(r"([0-9]+)([a-z]+)", size)
        if not s:
            raise ValueError("Invalid format of size")
        multiplier = {"K": 1 / 1024, "M": 1 / 1024**2,
                     "G": 1 / 1024**3}
        return int(s.group(1)) * multiplier[s.group(2)]
    except Exception as e:
        logger.exception(e)
        return 0