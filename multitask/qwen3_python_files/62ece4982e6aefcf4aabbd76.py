def match(filename):
	"""
	Check if the type of the given filename is 'doxyfile'

    Args:
        filename: filename to be check
    Returns:
        Return True if the type of the given filename in lower case is 'doxyfile'
	"""
	if os.path.isfile(filename) and os.path.splitext(filename)[1].lower() == '.doxy':
		return True
	else:
		return False