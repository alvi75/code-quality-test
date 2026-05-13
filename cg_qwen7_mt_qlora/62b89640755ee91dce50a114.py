def tzname_in_python2(namefunc):
	"""
	Change unicode output into bytestrings in Python 2
	"""
	if PY2:
		return lambda: [x.encode('ascii') for x in namefunc()]
	else:
		return namefunc