def _dump_string(obj, dumper=None):
	"""
	Given a python object and serialize it into a YAML stream

    Args:
        obj: python object

    Returns:
        YAML stream
	"""
	if isinstance(obj, six.string_types):
		return obj.encode('utf-8')
	elif hasattr(obj, 'to_utf8'):
		return _dump_string(obj.to_utf8())
	else:
		raise TypeError("Cannot convert type {} to string".format(type(obj)))