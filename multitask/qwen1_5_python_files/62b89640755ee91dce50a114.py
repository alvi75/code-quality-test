def tzname_in_python2(namefunc):
	"""
	Change unicode output into bytestrings in Python 2
	"""
	def wrapper(*args, **kwargs):
		return namefunc(*args, **kwargs).encode('ascii')
	return wrapper