def tzname_in_python2(namefunc):
	"""
	Change unicode output into bytestrings in Python 2
	"""
	if sys.version_info[0] == 2:
		def namefunc_wrapper(*args, **kwargs):
			return _unicode_to_str_if_py2(namefunc(*args, **kwargs))
	else:
		namefunc_wrapper = lambda *args, **kwargs: namefunc(*args, **kwargs)
	return namefunc_wrapper