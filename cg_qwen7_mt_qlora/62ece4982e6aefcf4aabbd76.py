def match(filename):
	"""
	Check if the type of the given filename is 'doxyfile'

    Args:
        filename: filename to be check
    Returns:
        Return True if the type of the given filename in lower case is 'doxyfile'
	"""

	if not os.path.isfile(filename):
		return False

	filename = os.path.basename(filename)
	ext = os.path.splitext(filename)[1]
	if ext == '.doxyfile':
		return True
	else:
		return False