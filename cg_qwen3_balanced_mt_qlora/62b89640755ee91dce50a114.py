def tzname_in_python2(namefunc):
	"""
	Change unicode output into bytestrings in Python 2
	"""
	if sys.version_info[0] == 2:
		return lambda *args, **kwargs: namefunc(*args, **kwargs).encode('utf-8')
	else:
		return namefunc