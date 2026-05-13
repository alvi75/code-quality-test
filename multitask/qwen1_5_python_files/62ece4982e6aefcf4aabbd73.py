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
	    platform = detect_platform()
	if platform == 1:
	    return shlex.split(s)
	elif platform == 0:
	    cmd_list = []
	    for token in shlex.split(s):
		cmd_list.extend(['"%s"' % t if '"' in t else t for t in cmd_quote(token)])
	    return cmd_list
	else:
	    raise ValueError('Platform not recognized')