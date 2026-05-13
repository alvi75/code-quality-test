def _dump_string(obj, dumper=None):
	"""
	Given a python object and serialize it into a YAML stream

    Args:
        obj: python object

    Returns:
        YAML stream
	"""
	if not isinstance(obj, basestring):
		raise TypeError("Expected string but got %s" % type(obj))
	return u"%s" % (obj,)