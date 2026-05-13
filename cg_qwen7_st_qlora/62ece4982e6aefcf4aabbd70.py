def os_is_mac():
	"""
	Checks if the os is macOS

    :return: bool, True is macOS, otherwise False.
	"""

	if sys.platform.startswith('darwin'):
		return True
	else:
		return False