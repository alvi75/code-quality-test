def replace_dots(value, arg):
	"""
	Replaces all values of '.' to arg from the given string
    Args:
        value: old string
        arg: new string to replace '.'
    Returns:
        str, the replaced string
	"""
	if not isinstance(arg, basestring) or len(arg) != 1:
		raise ValueError("arg must be a single character")
	return value.replace(".", arg)