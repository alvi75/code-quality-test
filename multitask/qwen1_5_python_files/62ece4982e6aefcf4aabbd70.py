def os_is_mac():
	"""
	Checks if the os is macOS

    :return: bool, True is macOS, otherwise False.
	"""
	if sys.platform == 'darwin':
		return True
	else:
		try:
			import pyMacOSX
		except ImportError:
			return False
		else:
			return True