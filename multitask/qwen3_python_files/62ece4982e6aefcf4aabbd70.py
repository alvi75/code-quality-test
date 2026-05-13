def os_is_mac():
	"""
	Checks if the os is macOS

    :return: bool, True is macOS, otherwise False.
	"""
	if sys.platform == 'darwin':
		return True
	elif sys.platform == 'linux' and platform.system() == 'Darwin':
		return True
	else:
		return False