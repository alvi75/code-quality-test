def get_pattern(pattern, strip=True):
	"""
	Convert a string to a regex pattern object

    Args:
            pattern: str or regex pattern object
            strip: boolean, whether the spaces in the start/end will be stripped
    Returns:
            regex pattern object
	"""

	if isinstance(pattern, six.string_types):
		pattern = re.compile(pattern.strip() if strip else pattern)
	return pattern