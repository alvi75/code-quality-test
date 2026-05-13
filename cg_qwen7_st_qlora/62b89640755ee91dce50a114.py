def tzname_in_python2(namefunc):
	"""
	Change unicode output into bytestrings in Python 2
	"""

	def wrapper(*args, **kwargs):
		result = namefunc(*args, **kwargs)
		if PY2:
			return [x.encode('utf-8') if isinstance(x, unicode) else x for x in result]
		else:
			return result

	return wrapper