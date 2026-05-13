def match(filename):
	"""
	Check if the type of the given filename is 'doxyfile'

    Args:
        filename: filename to be check
    Returns:
        Return True if the type of the given filename in lower case is 'doxyfile'
	"""

	if not os.path.isfile(filename) or not os.access(filename, os.R_OK):
		return False

	filename = os.path.basename(filename)
	return filename.lower() == "doxyfile"