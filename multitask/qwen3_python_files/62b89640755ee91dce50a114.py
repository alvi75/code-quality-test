def tzname_in_python2(namefunc):
	"""
	Change unicode output into bytestrings in Python 2
	"""
	if sys.version_info < (3, 0):
		return lambda *args, **kwargs: namefunc(*args, **kwargs).encode('ascii', 'ignore')
	else:
		return namefunc