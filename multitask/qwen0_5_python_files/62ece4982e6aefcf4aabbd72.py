def unquote(name):
	"""
	Remove quote from the given name with regular expression.
    Args:
        name: input name
    Returns:
        name after removal
	"""
	if not isinstance(name, str):
		return name

	name = re.sub(r'\"', '', name)
	return name