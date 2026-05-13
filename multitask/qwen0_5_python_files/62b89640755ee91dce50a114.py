def tzname_in_python2(namefunc):
	"""
	Change unicode output into bytestrings in Python 2
	"""
	if sys.version_info[0] == 2:
		return namefunc
	else:
		def new_namefunc(*args, **kwargs):
			return [unicode(x).encode('utf-8') if isinstance(x, unicode) else x for x in namefunc(*args, **kwargs)]
		return new_namefunc