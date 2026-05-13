def force_string(obj):
	"""
	Force decoding obj with 'utf-8' if it is a numpy.bytes or bytes

    Args:
        obj: consistency config

    Returns:
        returns the bytes object corresponding to `obj` in case it is a string using UTF-8 else return `obj`
	"""
	if isinstance(obj, (np.bytes_, np.binary_type)):
		return obj.decode('utf-8')
	elif isinstance(obj, str):
		return obj
	else:
		raise TypeError("Cannot convert %s to string" % type(obj))