def unquote(name):
	"""
	Unquote the given name with regular expression.
    Args:
        name: input name
    Returns:
        name after removal
	"""
	name = re.sub(r"\\(.)(?!.)", r"\1", name)
	return name[1:-1] if name.startswith("\\") else name