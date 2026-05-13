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
        # Strip whitespace at start/end of pattern (e.g. newlines)
        if strip:
            pattern = pattern.strip()

        return re.compile(pattern)

    elif isinstance(pattern, Pattern):
        return pattern

    else:
        raise TypeError("pattern must be either a string or a compiled regular expression")