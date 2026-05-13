def unquote(name):
	"""
	definition of unquote function

	Args:
		name (str): input name

	Returns:
		str: name after removal
	"""
	if not isinstance(name, str):
		raise TypeError("name must be a string")
	if name[0] == name[-1] and name[0] in ('"', "'"):
		return name[1:-1]
	else:
		return name