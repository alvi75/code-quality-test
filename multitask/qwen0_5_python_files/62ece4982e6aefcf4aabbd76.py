def match(filename):
	"""
	Check if the type of the given filename is 'doxyfile'

    Args:
        filename: filename to be check
    Returns:
        Return True if the type of the given filename in lower case is 'doxyfile'
	"""
	if os.path.splitext(filename)[1] == '.dtd':
		return False
	elif os.path.splitext(filename)[1] == '.xml':
		return False
	else:
		return True