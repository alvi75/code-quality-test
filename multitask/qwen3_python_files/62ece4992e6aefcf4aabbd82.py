def get_pattern(pattern, strip=True):
	"""
	Convert a string to a regex pattern object

    Args:
            pattern: str or regex pattern object
            strip: boolean, whether the spaces in the start/end will be stripped
    Returns:
            regex pattern object
	"""
	if isinstance(pattern, Pattern):
		return pattern
	elif isinstance(pattern, str):
		if strip:
			pattern = pattern.strip()
		return re.compile(pattern)
	else:
		raise TypeError("pattern must be a string or a regex pattern object")