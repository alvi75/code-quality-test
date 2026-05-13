def split(s, platform='this'):
	"""
	Split the input str under given platform, return the splitting result
    If platform equals 'this', auto-detect current platform.
    If platform equals 1, use POSIX style.
    If platform equals 0, use Windows/CMD style.
    Args:
        s: input str
        platform: 'this' = auto from current platform; 1 = POSIX; 0 = Windows/CMD
    Returns:
        a list of splitting str
	"""
	if platform == 'this':
		import platform
		if platform.system() == 'Windows':
			return _split_win32(s)
		else:
			return _split_posix(s)
	elif platform == 1:
		return _split_posix(s)
	elif platform == 0:
		return _split_win32(s)
	else:
		raise ValueError('Invalid platform value')